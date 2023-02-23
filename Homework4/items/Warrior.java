package items;


import interfaces.LeftHand;

import java.util.Random;

public abstract class Warrior<T extends LeftHand> {
    private String name;
    protected T weapon;
    protected Random rnd = new Random();
    private int healthPoint;


    public Warrior(String name) {
        this.name = name;
        healthPoint = 1000;
    }

    public int getHealthPoint() {
        return this.healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

//    public int hitDamage(Warrior enemy) {
//        int damage = rnd.nextInt(weapon.damage());
//        enemy.reduceHealthPoint(damage);
//        return damage;
//    }
//    public abstract int hitDamage(Warrior enemy);
//    public int getMaxDamage() {

    public String getName() {
        return name;
    }
//        return weapon.damage();
//    }



    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", healthPoint=" + healthPoint +
                '}';
    }

    public void getDamage(float dmg1) {
        this.healthPoint-=dmg1;
    }
}
