package ua.lviv.iot.lab2.model;

public class SeaLion extends Animal {
    private String name;
    private String color;
    private boolean eatsPenguins;

    public SeaLion(double foodConsumption, String name, String color, boolean eatsPenguins) {
        super(true, foodConsumption);
        this.name = name;
        this.color = color;
        this.eatsPenguins = eatsPenguins;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isEatsPenguins() {
        return eatsPenguins;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEatsPenguins(boolean eatsPenguins) {
        this.eatsPenguins = eatsPenguins;
    }

}
