package bo;

import exceptions.AlreadyDeadException;

public abstract class Animal {
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

    public int getAge() {
        return age;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public String getName() {
        return name;
    }

    public String getShout() {
        return shout;
    }

    public String eat() {
        return name + " is eating.";
    }

    public boolean getOlder() throws AlreadyDeadException {
        if (age >= ageMax) {
            throw new AlreadyDeadException(name + " has already reached the maximum age and is dead.");
        }
        age++;
        return true;
    }
}
