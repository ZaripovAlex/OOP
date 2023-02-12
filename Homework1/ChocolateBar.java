package org.example;

public class ChocolateBar extends Product {
    private int weight;
    public ChocolateBar(String name, double cost, int weight) {
        super(name, cost);
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" Вес %d грамм", weight));
        return localString.toString();
    }
}
