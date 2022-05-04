package ua.lviv.iot.lab6;

import ua.lviv.iot.lab2.model.Animal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class AnimalWriter {
    public static void writeToFile(List<Animal> animals) throws IOException {
        FileWriter fileWriter = new FileWriter("animals.csv");

        animals.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getClass().getTypeName().compareTo(o2.getClass().getTypeName());
            }
        });

        String previousType = "";
        fileWriter.write("");
        for(Animal animal: animals){
            if(!previousType.equals(animal.getClass().getTypeName())){
                fileWriter.write(animal.getHeaders());
                fileWriter.write("\r\n");
                previousType = animal.getClass().getTypeName();
            }
            fileWriter.write(animal.toCSV());
            fileWriter.write("\r\n");
        }

        fileWriter.close();
    }
}
