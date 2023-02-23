package weapons;

import interfaces.LeftHand;

public class Bow extends Weapon implements  LeftHand {

    private int distance = 30;
    private String qual;

    public int getDistance() {
        return distance;
    }



    @Override
    public String toString() {
        return "\nЛук имеет урон " + damage() +  " качество: "+ this.qual;
    }


    @Override
    public int damage() {
        int damage = rnd.nextInt(100);
        if (damage<20) this.qual = "Обычный";
        else if (damage>=20 && damage< 40) this.qual = "Качественный";
        else if (damage>=40 && damage< 60) this.qual = "Отличный";
        else if (damage>=60 && damage< 80) this.qual = "Эпический";
        else if (damage>=80 && damage < 100) this.qual = "Легендарный";
        return damage;
    }
}
