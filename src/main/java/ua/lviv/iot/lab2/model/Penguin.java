package ua.lviv.iot.lab2.model;

public class Penguin extends Animal {
    private final boolean canFly;

    public Penguin(double foodConsumption, String name, String color, boolean canFly) {
        super(false, foodConsumption, name, color);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

}
