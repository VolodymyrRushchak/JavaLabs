package ua.lviv.iot.lab2.model;

public class Seal extends Animal {
    private boolean isCute;
    private boolean isRussian;

    public Seal(double foodConsumption, String name, String color, boolean isCute, boolean isRussian) {
        super(true, foodConsumption, name, color);
        this.isCute = isCute;
        this.isRussian = isRussian;
    }

    public boolean isCute() {
        return isCute;
    }

    public boolean isRussian() {
        return isRussian;
    }

    public void setCute(boolean cute) {
        isCute = cute;
    }

    public void setRussian(boolean russian) {
        isRussian = russian;
    }

}
