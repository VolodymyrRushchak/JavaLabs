package lab2;

import lab2.model.*;

class Azov {

    static void kill(Animal russianBitch){
        russianBitch = null;
    }

}

public class Main {
    public static void main(String[] args) {
        Penguin jonny = new Penguin(3,"John", "BLACK", true);
        Seal ivan = new Seal(5,"Ivan", "RED", false, true);
        SeaLion kolya = new SeaLion(4, "Mykola", "WHITE-BLACK", true);

        Azov.kill(ivan);
    }
}
