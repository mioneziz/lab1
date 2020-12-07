package bsu.rfe.java.group9.lab1.Kutsis.var13;

import java.util.Objects;

public class Apple extends Food {
private int calories = 47;
    public Apple()
    {
        super("Яблоко");
    }
    public void consume()
    {
System.out.println(this+" Съедено");
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return name.equals(((Apple)arg0).name);
        } else
            return false;
    }

    @Override
    public int calculateCalories()
    {
return calories;
    }
}
