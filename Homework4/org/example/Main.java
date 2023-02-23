package org.example;

import interfaces.DistanceAttacker;
import items.Archer;
import items.SwordMan;
import weapons.Bow;
import weapons.Shields;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {

        SwordMan greg = new SwordMan("Petya", new Sword(), new Shields());
        Archer misha = new Archer("Petya", new Bow());



        while (greg.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
            float def1 = 0;
            float def2 = 0;
            if (greg instanceof DistanceAttacker)
            {def1 = 0.3f;}
            else def1 = greg.getRighthand().defence();
            if (misha instanceof DistanceAttacker)
            {def1 = 0.3f;}
            else def1 = misha.getRightHand().defence();


            greg.setHealthPoint((int)(greg.getHealthPoint()-misha.getLeftHand().damage() *(1-def1)));
            System.out.println("greg "+ greg.getHealthPoint());
            misha.setHealthPoint((int) (misha.getHealthPoint()-greg.getLefthand().damage()*(1-def2)));
            System.out.println("misha "+misha.getHealthPoint());

        }

        if (greg.getHealthPoint()>0)
            System.out.println("Гриша победил");
        else
            System.out.println("Миша победил");
    }
}