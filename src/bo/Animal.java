package bo;

import exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    protected String name;
    protected int age;
    protected int ageMax;
    protected String shout;

    public Animal(String name, int age, int ageMax, String shout) {
        this.name = name;
        this.age = age;
        this.ageMax = ageMax;
        this.shout = shout;
    }

    public void ageOneYear() throws AlreadyDeadException {
        if (age >= ageMax) {
            throw new AlreadyDeadException("L'animal " + name + " est mort car il a dépassé son âge maximum.");
        }
        age++;
    }

    public String getName() {
        return name;
    }
}
