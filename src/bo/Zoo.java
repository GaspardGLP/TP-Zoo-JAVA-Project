package bo;

import exceptions.AlreadyDeadException;
import exceptions.FullZooException;
import exceptions.EmptyZooException;

public class Zoo {
    private Manager dir;
    private int nbAnim;
    private Animal[] tabAnim;

    public Zoo(Manager dir, int nbMax) {
        this.dir = dir;
        this.nbAnim = 0;
        this.tabAnim = new Animal[nbMax];
    }

    public boolean add(Animal a) throws FullZooException, AlreadyDeadException {
        if (nbAnim >= tabAnim.length) {
            throw new FullZooException("The zoo is full, cannot add more animals.");
        }
        if (a.getAge() >= a.getAgeMax()) {
            throw new AlreadyDeadException(a.getName() + " is already dead.");
        }
        tabAnim[nbAnim++] = a;
        return true;
    }

    public boolean remove(Animal a) throws EmptyZooException {
        if (nbAnim == 0) {
            throw new EmptyZooException("The zoo is empty, cannot remove any animals.");
        }
        for (int i = 0; i < nbAnim; i++) {
            if (tabAnim[i].equals(a)) {
                tabAnim[i] = tabAnim[--nbAnim]; // Swap the last element to the removed position
                tabAnim[nbAnim] = null;
                return true;
            }
        }
        return false;
    }

    public void feedZoo() throws EmptyZooException {
        if (nbAnim == 0) {
            throw new EmptyZooException("The zoo is empty, there are no animals to feed.");
        }
        for (int i = 0; i < nbAnim; i++) {
            System.out.println(tabAnim[i].eat());
        }
    }

    public void ageAllAnimals() throws EmptyZooException, AlreadyDeadException {
        if (nbAnim == 0) {
            throw new EmptyZooException("The zoo is empty, no animals to age.");
        }
        for (int i = 0; i < nbAnim; i++) {
            tabAnim[i].getOlder(); // Lève AlreadyDeadException si l'animal est déjà mort
        }
    }

    public void listZoo() throws EmptyZooException {
        if (nbAnim == 0) {
            throw new EmptyZooException("The zoo is empty, no animals to display.");
        }
        for (int i = 0; i < nbAnim; i++) {
            System.out.println(tabAnim[i].toString());
        }
    }
}
