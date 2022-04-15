package ua.lviv.iot.lab1;

public class Main {

    public static void main(String[] args) {

        Printer[] array = new Printer[3];
        array[0] = new Printer();
        array[1] = new Printer("BF",101.2,"Urban Mueller");
        array[2] = new Printer("GBL", 15, 150, "MY GRANDPA", true, 125);

        for (Printer printer : array) {
            System.out.println(printer);
            System.out.println();
        }

    }

}
