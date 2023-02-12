package org.example;

public class Water extends Product {
    private double volume;
    public Water(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;


    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" Объем: %.1fl", volume));
        return localString.toString();
    }
}

