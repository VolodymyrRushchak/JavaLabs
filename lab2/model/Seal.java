package lab2.model;

public class Seal extends Animal {
    private String name;
    private String color;
    private boolean isCute;
    private boolean isRussian;

    public Seal(double foodConsumption, String name, String color, boolean isCute, boolean isRussian) {
        super(true, foodConsumption);
        this.name = name;
        this.color = color;
        this.isCute = isCute;
        this.isRussian = isRussian;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isCute() {
        return isCute;
    }

    public boolean isRussian() {
        return isRussian;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCute(boolean cute) {
        isCute = cute;
    }

    public void setRussian(boolean russian) {
        isRussian = russian;
    }

}
