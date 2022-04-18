package ua.lviv.iot;

import ua.lviv.iot.lab2.model.Animal;
import ua.lviv.iot.lab2.model.Penguin;
import ua.lviv.iot.lab2.model.SeaLion;
import ua.lviv.iot.lab2.model.Seal;
import ua.lviv.iot.lab3.manager.impl.AnimalManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Penguin jonny = new Penguin(3,"John", "BLACK", true);
        Seal ivan = new Seal(5,"Ivan", "RED", false, true);
        SeaLion kolya = new SeaLion(4, "Mykola", "WHITE-BLACK", true);

        List<Animal> list = new ArrayList<>();
        list.add(new Seal(6,"Kovalski","WHITE-BLACK",false, false));
        list.add(new Seal(2,"Riadovoy","WHITE-BLACK",false, false));
        list.add(new Seal(1,"Ricko","WHITE-BLACK",false, false));
        list.add(new Seal(5,"Shckiper","WHITE-BLACK",false, false));
        list.add(jonny);
        list.add(ivan);
        list.add(kolya);
        AnimalManager manager = new AnimalManager(list);

        for (Animal animal: manager.getCarnivorousWithFoodConsumptionNotLessThan(5)) {
            System.out.println(animal.getName());
        }

        manager.sortByFoodConsumption(true);

        System.out.println();

        for (Animal animal: list) {
            System.out.println(animal.getName() + ": " + animal.getFoodConsumption());
        }

        manager.sortByFoodConsumption(false);

        System.out.println();

        for (Animal animal: list) {
            System.out.println(animal.getName() + ": " + animal.getFoodConsumption());
        }

    }
}
