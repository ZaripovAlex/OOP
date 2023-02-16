package org.example.zoo;

public class Crocodile extends Predator implements Runable, Flyable, Swimable {
    private int flightSpeed = 15;
    private int flightHing = 5;
    private int runSpeed = 100;
    private int swimSpeed = 20;

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Shhhhh";
    }


    @Override
    public int getSwimspeed() {
        return this.swimSpeed;
    }


    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHigh() {
        return this.flightHing;
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
