package org.example;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Chips("Lays", 100, "Краб", 81));
        machine.addProduct(new ChocolateBar("Mars", 70,100));
        machine.addProduct(new ChocolateBar("Twix", 70.99,100));
        machine.addProduct(new Chocolate("Алёнка", 90,70));
        machine.addProduct(new Water("Колокольчик", 85, 1.5));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Коровка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Василёк", 85, new Date(2023, 1, 25)));

        System.out.println(machine);
        System.out.println("__________________________________");
        System.out.println(machine.findProduct("Молоко"));
        System.out.println(machine.findProduct("Алёнка"));
        System.out.println(machine.findProduct("Пиво"));
        System.out.println("__________________________________");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("__________________________________");
        System.out.println(machine);


    }
}