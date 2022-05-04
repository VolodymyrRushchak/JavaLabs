package ua.lviv.iot.lab2.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seal extends Animal {
    private boolean isCute;
    private boolean isRussian;

    public Seal(double foodConsumption, String name, String color, boolean isCute, boolean isRussian) {
        super(true, foodConsumption, name, color);
        this.isCute = isCute;
        this.isRussian = isRussian;
    }

}
