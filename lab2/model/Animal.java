package ua.lviv.iot.lab2.model;

public abstract class Animal {
    private final boolean isCarnivorous;
    private final double foodConsumption;   // in kilograms per day

    public Animal(boolean isCarnivorous, double foodConsumption) {
        this.isCarnivorous = isCarnivorous;
        this.foodConsumption = foodConsumption;
    }

    public boolean isCarnivorous(){
        return isCarnivorous;
    }

    public double getFoodConsumption(){
        return foodConsumption;
    }

}
