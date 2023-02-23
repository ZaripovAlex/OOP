package items;

import interfaces.LeftHand;
import interfaces.RightHand;
import weapons.Sword;

public class SwordMan extends Warrior<Sword> {
    private LeftHand lefthand;
    private RightHand righthand;

    public SwordMan(String name, LeftHand lefthand, RightHand righthand) {
        super(name);
        this.lefthand = lefthand;
        this.righthand = righthand;
    }



    public LeftHand getLefthand() {
        return lefthand;
    }

    public RightHand getRighthand() {
        return righthand;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }


}
