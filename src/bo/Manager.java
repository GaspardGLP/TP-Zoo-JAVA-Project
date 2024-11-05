package bo;

import exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private String name;
    private int ySeniority;

    public Manager(String name, int ySeniority) {
        this.name = name;
        this.ySeniority = ySeniority;
    }

    public int getYSeniority() {
        return ySeniority;
    }

    public void setYSeniority(int seniority) {
        this.ySeniority = seniority;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Manager{name='" + name + "', ySeniority=" + ySeniority + "}";
    }
}
