package ua.lviv.iot.lab3.manager;

import ua.lviv.iot.lab2.model.Animal;

import java.util.List;

public interface IAnimalManager {

    List<Animal> getCarnivorousWithFoodConsumptionNotLessThan(double foodConsumption);

    void sortByFoodConsumption(boolean ascending);

}
