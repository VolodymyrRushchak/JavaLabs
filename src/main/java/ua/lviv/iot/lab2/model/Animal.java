package ua.lviv.iot.lab2.model;

public abstract class Animal {
    private final boolean isCarnivorous;
    private final double foodConsumption;   // in kilograms per day
    private final String name;
    private final String color;

    public Animal(boolean isCarnivorous, double foodConsumption, String name, String color) {
        this.isCarnivorous = isCarnivorous;
        this.foodConsumption = foodConsumption;
        this.name = name;
        this.color = color;
    }

    public boolean isCarnivorous(){
        return isCarnivorous;
    }

    public double getFoodConsumption(){
        return foodConsumption;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
