package bo;

import exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class CatLike extends Animal {
    private String race;

    public CatLike(String name, int age, int ageMax, String shout, String race) {
        super(name, age, ageMax, shout);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return "CatLike{name='" + name + "', race='" + race + "', age=" + age + ", shout='" + shout + "'}";
    }
}
