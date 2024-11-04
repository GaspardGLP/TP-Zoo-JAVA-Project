package go;

import bo.*;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        try {
            Manager manager = new Manager("John", 10);
            Zoo zoo = new Zoo(manager, 2);

            Animal cat = new CatLike("Tom", 3, 4, "Meow", "Siamese");
            Animal bird = new Bird("Tweety", 2, 5, "Tweet", "Yellow");
            Animal monkey = new Monkey("George", 5, 6, "Ooh ooh");

            zoo.add(cat);
            zoo.add(bird);
            zoo.add(monkey);
            zoo.listZoo();
            zoo.feedZoo();
            zoo.ageAllAnimals();

        } catch (FullZooException | EmptyZooException | AlreadyDeadException e) {
            System.err.println(e.getMessage());
        }
    }
}
