package org.example;

public class Chips extends Product{
    private String taste;
    private int weight;

    public Chips(String name, double cost, String taste, int weight) {
        super(name, cost);
        this.taste = taste;
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" Вкус: %s",taste));
        localString.append(String.format(" Вес %d грамм", weight));
        return localString.toString();
    }
}
