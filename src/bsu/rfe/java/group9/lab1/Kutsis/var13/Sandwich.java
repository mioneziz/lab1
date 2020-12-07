package bsu.rfe.java.group9.lab1.Kutsis.var13;

public class Sandwich extends Food
{
    private  Food filling1;
    private  Food filling2;



    public Sandwich(Food Filling1, Food Filling2)
    {
        super("Сэндвич");
        this.filling1 = Filling1;
        this.filling2 = Filling2;


    }



    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Sandwich)) return false;
            return name.equals(((Sandwich)arg0).name);
        } else
            return false;
    }




    @Override
    public int calculateCalories()
    {
        return filling1.calculateCalories() + filling2.calculateCalories();
    }
    @Override
    public void consume() {
        System.out.println(this + " c " + this.filling1 + " и " + this.filling2 + " Съеден");
    }
}
