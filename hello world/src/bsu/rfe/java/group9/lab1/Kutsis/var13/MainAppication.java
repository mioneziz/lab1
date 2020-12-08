package bsu.rfe.java.group9.lab1.Kutsis.var13;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class MainAppication
{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        int howManyCaloriesInBreakfast = 0;
        for (String arg : args) {
            if (arg.equals("-calories")) {
                for (Food item : breakfast)
                    if (item != null)
                        howManyCaloriesInBreakfast += item.calculateCalories();
                    else
                        break;
                System.out.println("Общая калорийность завтрака: " + howManyCaloriesInBreakfast);
            } else if (arg.equals("-sort")) {
                Arrays.sort(breakfast, new Comparator<Food>() {
                    public int compare(Food a, Food b) {
                        return b.toString().length() - a.toString().length();
                    }
                });
                System.out.println("Отсортированный вариант:");
            } else {
                String[] parts = arg.split("/");


                Class myClass = Class.forName("bsu.rfe.java.group9.lab1.Kutsis.var13." + parts[0]);


                if (parts.length == 1) {
                    Constructor constructor = myClass.getConstructor();
                    breakfast[itemsSoFar] = (Food) constructor.newInstance();
                    itemsSoFar++;
                } else if (parts.length == 2) {
                    Constructor constructor = myClass.getConstructor(Food.class);
                    breakfast[itemsSoFar] = (Food) constructor.newInstance(parts[1]);
                    itemsSoFar++;
                }
                if (parts.length == 3) {
                    Class myClass1 = Class.forName("bsu.rfe.java.group9.lab1.Kutsis.var13." + parts[1]);
                    Class myClass2 = Class.forName("bsu.rfe.java.group9.lab1.Kutsis.var13." + parts[2]);
                    Constructor constructor1 = myClass1.getConstructor();
                    Constructor constructor2 = myClass2.getConstructor();
                    Constructor constructor = myClass.getConstructor(Food.class, Food.class);
                    breakfast[itemsSoFar] = (Food) constructor.newInstance(constructor1.newInstance(), constructor2.newInstance());
                    itemsSoFar++;
                }
            }
        }

        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            }
        }
        for (Food item : breakfast) {
            if (item != null) {
                System.out.println(item.getName() + " " + item.calculateCalories());
            } else
                break;
        }


        System.out.println("Всего хорошего!");

    }



    }


