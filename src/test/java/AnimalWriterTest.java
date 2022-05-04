import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.model.Animal;
import ua.lviv.iot.lab2.model.Penguin;
import ua.lviv.iot.lab2.model.SeaLion;
import ua.lviv.iot.lab2.model.Seal;
import ua.lviv.iot.lab6.AnimalWriter;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalWriterTest {

    @Test
    public void testWritingAnimalsEmptyListCase() throws IOException {
        List<Animal> list = new ArrayList<>();
        AnimalWriter.writeToFile(list);
        FileReader file = new FileReader("animals.csv");
        Scanner scanner = new Scanner(file);
        StringBuilder result = new StringBuilder();
        while (scanner.hasNextLine()){
            result.append(scanner.nextLine());
        }
        assertEquals("", result.toString());
        file.close();
    }

    @Test
    public void testWritingAnimalsSameInstancesCase() throws IOException {
        List<Animal> list = new ArrayList<>();
        list.add(new Penguin(4.2,"Kovalski","White-Black",false));
        list.add(new Penguin(3.2,"Riadovoy","White-Black",false));
        list.add(new Penguin(4.5,"Shkiper","White-Black",false));
        list.add(new Penguin(5,"Rico","White-Black",true));
        AnimalWriter.writeToFile(list);
        assertEquals(-1L, Files.mismatch(Path.of("animals.csv"),
                Path.of("animalsTestTemplate.csv")));
    }

    @Test
    public void testWritingAnimalsDifferentInstancesCase() throws IOException {
        List<Animal> list = new ArrayList<>();
        list.add(new SeaLion(9,"Csar","Golden",true));
        list.add(new Penguin(5.5,"Anton","Transperent",false));
        list.add(new Penguin(201,"Rico","White-Black",true));
        list.add(new Seal(13.3,"Obzora","Gray",true,false));
        AnimalWriter.writeToFile(list);
        assertEquals(-1L, Files.mismatch(Path.of("animals.csv"),
                Path.of("animalsTestTemplateDifferentInstances.csv")));
    }

}
