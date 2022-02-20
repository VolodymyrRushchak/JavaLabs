public class Main {

    public static void main(String[] args) {

        Printer printer1 = new Printer();
        Printer printer2 = new Printer("BF",101.2,"Urban Mueller");
        Printer printer3 = new Printer("GBL", 15, 150, "MY GRANDPA", true, 125);

        System.out.println(printer1);
        System.out.println();

        System.out.println(printer2);
        System.out.println();

        System.out.println(printer3);
        System.out.println();

    }

}
