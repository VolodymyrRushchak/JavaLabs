import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lab2.model.Animal;
import ua.lviv.iot.lab2.model.Penguin;
import ua.lviv.iot.lab2.model.SeaLion;
import ua.lviv.iot.lab2.model.Seal;
import ua.lviv.iot.lab3.manager.impl.AnimalManager;

import java.util.ArrayList;
import java.util.List;

public class AnimalManagerTest {
    private static AnimalManager animalManager;
    private static List<Animal> animalList;

    @BeforeEach
    void initAnimalManager(){
        animalList = new ArrayList<>();
        animalList.add(new SeaLion(9,"Csar","Golden",true));
        animalList.add(new Penguin(5.5,"Anton","Transperent",false));
        animalList.add(new Penguin(201,"Rico","White-Black",true));
        animalList.add(new Seal(13.3,"Obzora","Gray",true,false));
        animalManager = new AnimalManager(animalList);
    }

    @Test
    public void testGettingCarnivorousWithFoodConsumptionNotLessThanNullCase(){
        AnimalManager animalManager = new AnimalManager(null);
        assertThrows(NullPointerException.class,
                ()->animalManager.getCarnivorousWithFoodConsumptionNotLessThan(8));
    }

    @Test
    public void testGettingCarnivorousWithFoodConsumptionNotLessThanOneElementCase(){
        List<Animal> animalList = new ArrayList<>();
        Animal seal = new Seal(13.3,"Obzora","Gray",true,false);
        animalList.add(seal);
        AnimalManager animalManager = new AnimalManager(animalList);
        List<Animal> testList = animalManager.getCarnivorousWithFoodConsumptionNotLessThan(8);
        assertEquals(1,testList.size());
        assertTrue(testList.contains(seal));
    }

    @Test
    public void testGettingCarnivorousWithFoodConsumptionNotLessThanRegularCase(){
        List<Animal> testList = animalManager.getCarnivorousWithFoodConsumptionNotLessThan(8);
        assertEquals(2,testList.size());
        assertTrue(testList.contains(animalList.get(0)));
        assertTrue(testList.contains(animalList.get(3)));
    }

    @Test
    public void testSortingByFoodConsumptionDescendingNullCase(){
        AnimalManager animalManager = new AnimalManager(null);
        assertThrows(NullPointerException.class,
                ()->animalManager.sortByFoodConsumption(false));
    }

    @Test
    public void testSortingByFoodConsumptionDescendingOneElementCase(){
        List<Animal> animalList = new ArrayList<>();
        Animal seal = new Seal(13.3,"Obzora","Gray",true,false);
        animalList.add(seal);
        AnimalManager animalManager = new AnimalManager(animalList);
        animalManager.sortByFoodConsumption(false);
        assertEquals(1,animalList.size());
        assertTrue(animalList.contains(seal));
    }

    @Test
    public void testSortingByFoodConsumptionDescendingRegularCase(){
        animalManager.sortByFoodConsumption(false);
        assertEquals(201,animalList.get(0).getFoodConsumption());
        assertEquals(13.3,animalList.get(1).getFoodConsumption());
        assertEquals(9,animalList.get(2).getFoodConsumption());
        assertEquals(5.5,animalList.get(3).getFoodConsumption());
    }

    @Test
    public void testSortingByFoodConsumptionAscendingNullCase(){
        AnimalManager animalManager = new AnimalManager(null);
        assertThrows(NullPointerException.class,
                ()->animalManager.sortByFoodConsumption(true));
    }

    @Test
    public void testSortingByFoodConsumptionAscendingOneElementCase(){
        List<Animal> animalList = new ArrayList<>();
        Animal seal = new Seal(13.3,"Obzora","Gray",true,false);
        animalList.add(seal);
        AnimalManager animalManager = new AnimalManager(animalList);
        animalManager.sortByFoodConsumption(true);
        assertEquals(1,animalList.size());
        assertTrue(animalList.contains(seal));
    }

    @Test
    public void testSortingByFoodConsumptionAscendingRegularCase(){
        animalManager.sortByFoodConsumption(true);
        assertEquals(5.5,animalList.get(0).getFoodConsumption());
        assertEquals(9,animalList.get(1).getFoodConsumption());
        assertEquals(13.3,animalList.get(2).getFoodConsumption());
        assertEquals(201,animalList.get(3).getFoodConsumption());
    }

}
