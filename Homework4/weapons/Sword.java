package weapons;

import interfaces.LeftHand;

import java.util.Random;

public class Sword extends Weapon implements LeftHand {
private String qual;



    @Override
    public String toString() {
        return "\nМеч имеет урон " + damage() +  super.toString();
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
