package org.example.zoo;

public class Dog extends Predator implements Runable, Swimable{
    private int runSpeed = 310;
    private int swimSpeed =20;

    public Dog(String name) {
        super(name);
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public String say() {
        return "Гав гав!!!!";
    }

    @Override
    public int getSwimspeed() {
        return this.swimSpeed;
    }
}
