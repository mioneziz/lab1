package bsu.rfe.java.group9.lab1.Kutsis.var13;

public class Cheese extends Food {
private int calories=240;
    public Cheese() {
        super("Сыр");

    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Cheese)) return false;
            return name.equals(((Cheese)arg0).name);
        } else
            return false;
    }
    public void consume() {
        System.out.println(this + " съеден");
    }


    @Override
    public int calculateCalories()
    {
    return calories;
    }
}
