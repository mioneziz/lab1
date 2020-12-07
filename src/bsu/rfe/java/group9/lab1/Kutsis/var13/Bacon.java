package bsu.rfe.java.group9.lab1.Kutsis.var13;

public class Bacon extends Food
{
    private int calories=541;
    public Bacon()
    {
        super("Бекон");

    }
    public boolean equals(Object arg0)
    {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Bacon)) return false;
            return name.equals(((Bacon)arg0).name);
        } else
            return false;
    }
    public void consume()
    {
        System.out.println(this + " съеден");
    }

    @Override
    public int calculateCalories()
    {
        return calories;

    }
}
