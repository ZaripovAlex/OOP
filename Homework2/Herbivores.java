package org.example.zoo;

public abstract class Herbivores extends Animal {

    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Grass";
    }


}
