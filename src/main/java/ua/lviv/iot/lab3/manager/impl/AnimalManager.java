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
        this.animalList = new ArrayList<>(animalList);
    }


    @Override
    public List<Animal> getCarnivorousWithFoodConsumptionNotLessThan(double foodConsumption) {
        return animalList.stream()
                .filter(animal -> (animal.isCarnivorous() && animal.getFoodConsumption() >= foodConsumption))
                .collect(Collectors.toList());
    }

    @Override
    public void sortByFoodConsumption(boolean ascending) {
        animalList.sort((o1, o2) -> {
            double difference = o1.getFoodConsumption() - o2.getFoodConsumption();
            if (difference < 0) {
                return ascending ? -1 : 1;
            } else if ((int) difference == 0) {
                return 0;
            } else {
                return ascending ? 1 : -1;
            }
        });
    }
    
    public List<Animal> getAnimalList() {
        return new ArrayList<>(animalList);
    }

}

