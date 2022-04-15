package ua.lviv.iot.lab3.manager.impl;

import ua.lviv.iot.lab2.model.Animal;
import ua.lviv.iot.lab2.model.Penguin;
import ua.lviv.iot.lab2.model.Seal;
import ua.lviv.iot.lab3.manager.IAnimalManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalManager implements IAnimalManager {
    private List<Animal> animalList;

    public AnimalManager(List<Animal> animalList){
        this.animalList = animalList;
    }


    @Override
    public List<Animal> getCarnivorousWithFoodConsumptionNotLessThan(double foodConsumption) {
        return animalList.stream()
                .filter(animal -> (animal.isCarnivorous() && animal.getFoodConsumption() >= foodConsumption))
                .collect(Collectors.toList());
    }

    @Override
    public void sortByFoodConsumption(boolean ascending) {
        animalList.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                double difference = o1.getFoodConsumption() - o2.getFoodConsumption();
                if      (difference < 0)
                    return ascending ? -1 : 1;
                else if (difference == 0)
                    return 0;
                else
                    return ascending ? 1 : -1;
            }
        });
    }

}

class Main {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Seal(6,"Kovalski","WHITE-BLACK",false, false));
        list.add(new Seal(2,"Riadovoy","WHITE-BLACK",false, false));
        list.add(new Seal(1,"Ricko","WHITE-BLACK",false, false));
        list.add(new Seal(5,"Shckiper","WHITE-BLACK",false, false));
        AnimalManager manager = new AnimalManager(list);

        for (Animal animal: manager.getCarnivorousWithFoodConsumptionNotLessThan(5)) {
            System.out.println(animal.getFoodConsumption());
        }

        manager.sortByFoodConsumption(true);

        System.out.println();

        for (Animal animal: list) {
            System.out.println(animal.getFoodConsumption());
        }

        manager.sortByFoodConsumption(false);

        System.out.println();

        for (Animal animal: list) {
            System.out.println(animal.getFoodConsumption());
        }



    }
}