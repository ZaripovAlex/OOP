package org.example.zoo;

public  class Beaver extends Predator implements Swimable, Runable {

    private Integer SweemSpeed = 210;
    private Integer RunSpeed = 10;

    public Beaver(String name) {
        super(name);
    }


    @Override
    public String say() {
        return "Фыр-фыр";
    }

    @Override
    public int getSwimspeed() {
        return this.SweemSpeed;
    }

    @Override
    public int getSpeedRun() {
        return this.RunSpeed;
    }
}
