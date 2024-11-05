package go;

import bo.*;
import exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 5);
        Zoo zoo = new Zoo(manager, 3);

        try {
            zoo.add(new CatLike("Chat1", 2, 15, "Siamois"));
            zoo.add(new Bird("Oiseau1", 1, 5, "Bleu"));
            zoo.add(new Monkey("Singe1", 4, 25));
            zoo.add(new CatLike("Chat2", 3, 12, "Persan"));
        } catch (FullZooException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            zoo.listZoo();
            zoo.ageAllAnimals();
        } catch (EmptyZooException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (AlreadyDeadException e) {
            System.out.println("Erreur : Un animal est mort - " + e.getMessage());
        }
    }
}

