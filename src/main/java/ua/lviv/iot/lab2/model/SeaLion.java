package ua.lviv.iot.lab2.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeaLion extends Animal {
    private boolean eatsPenguins;

    public SeaLion(double foodConsumption, String name, String color, boolean eatsPenguins) {
        super(true, foodConsumption, name, color);
        this.eatsPenguins = eatsPenguins;
    }
    
    public String getHeaders() {
        return super.getHeaders() + ",eatsPenguins";
    }

    public String toCSV() {
        return super.toCSV() + "," + eatsPenguins;
    }

}
