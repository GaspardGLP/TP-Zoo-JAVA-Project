package bo;

import exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Manager dir;
    private int nbPlaceMax;
    private List<Animal> alAnimal;

    public Zoo(Manager dir, int nbPlaceMax) {
        this.dir = dir;
        this.nbPlaceMax = nbPlaceMax;
        this.alAnimal = new ArrayList<>();
    }

    public boolean add(Animal animal) throws FullZooException {
        if (alAnimal.size() >= nbPlaceMax) {
            throw new FullZooException("Le zoo est plein, impossible d'ajouter un nouvel animal.");
        }
        return alAnimal.add(animal);
    }

    public boolean remove(int index) {
        if (index >= 0 && index < alAnimal.size()) {
            alAnimal.remove(index);
            return true;
        }
        return false;
    }

    public void feedAnimal() {
        for (Animal animal : alAnimal) {
            System.out.println(animal.getName() + " est nourri.");
        }
    }

    public void ageAllAnimals() throws EmptyZooException, AlreadyDeadException {
        if (alAnimal.isEmpty()) {
            throw new EmptyZooException("Le zoo est vide, aucun animal à faire vieillir.");
        }
        for (Animal animal : alAnimal) {
            animal.ageOneYear();
        }
    }

    public void listZoo() {
        if (alAnimal.isEmpty()) {
            System.out.println("Le zoo est vide.");
        } else {
            for (Animal animal : alAnimal) {
                System.out.println(animal);
            }
        }
    }
}
