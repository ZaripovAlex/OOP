package items;

import interfaces.LeftHand;
import interfaces.RightHand;
import weapons.Bow;
import interfaces.DistanceAttacker;

public class Archer extends Warrior<Bow> implements DistanceAttacker{
    LeftHand leftHand;
    RightHand rightHand;
    private int distance;

    public LeftHand getLeftHand() {
        return leftHand;
    }

    public Archer(String name, LeftHand leftHand) {
        super(name);
        this.leftHand =leftHand;

//        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    public RightHand getRightHand() {
        return rightHand;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" +
                "distance=" + distance +
                '}';
    }


}
