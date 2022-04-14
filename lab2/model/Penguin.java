package ua.lviv.iot.lab2.model;

public class Penguin extends Animal {
    private String name;
    private String color;
    private boolean canFly;

    public Penguin(double foodConsumption, String name, String color, boolean canFly) {
        super(false, foodConsumption);
        this.name = name;
        this.color = color;
        this.canFly = canFly;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

}
