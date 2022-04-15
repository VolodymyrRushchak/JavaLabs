package ua.lviv.iot.lab1;

record Printer(String name, double rateOfPrinting, double price,
               String manufacturer, boolean providesColor, double powerUse){

    static private final double commonRateOfPrinting = 12;

    public Printer() {
        this("NONE", 50, "NONE");
    }

    public Printer(String name, double price, String manufacturer) {
        this(name, commonRateOfPrinting, price, manufacturer, false, 220);
    }

    public static double getCommonRateOfPrinting(){
        return commonRateOfPrinting;
    }

    @Override
    public String toString() {
        return "About printer:\n" +
                "\tname: " + name + ";\n" +
                "\trateOfPrinting: " + rateOfPrinting + ";\n" +
                "\tprice: " + price + ";\n" +
                "\tmanufacturer: " + manufacturer + ";\n" +
                "\tprovidesColor: " + providesColor + ";\n" +
                "\tpowerUse: " + powerUse + ";\n";
    }

}
