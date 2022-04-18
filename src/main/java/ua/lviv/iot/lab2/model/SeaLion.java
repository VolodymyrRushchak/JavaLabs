package ua.lviv.iot.lab2.model;

public class SeaLion extends Animal {
    private boolean eatsPenguins;

    public SeaLion(double foodConsumption, String name, String color, boolean eatsPenguins) {
        super(true, foodConsumption, name, color);
        this.eatsPenguins = eatsPenguins;
    }

    public boolean isEatsPenguins() {
        return eatsPenguins;
    }

    public void setEatsPenguins(boolean eatsPenguins) {
        this.eatsPenguins = eatsPenguins;
    }

}
