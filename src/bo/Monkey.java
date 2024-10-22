package bo;

public class Monkey extends Animal {

    public Monkey(String name, int age, int ageMax, String shout) {
        super(name, age, ageMax, shout);
    }

    @Override
    public String toString() {
        return "Monkey{name='" + name + "', age=" + age + ", shout='" + shout + "'}";
    }
}
