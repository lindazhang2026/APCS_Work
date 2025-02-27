import java.util.*;
public class AnimalCalculator
{
    public void printName(ArrayList<Animal> animals)
    {
        for (Animal animal : animals)
        {
            System.out.println("Name: " + animal.getName() + "; Leg Count: " + animal.getLegCount() + "; Furry? " + animal.getFurriness());
        }
    }
    public int averageLegCount(ArrayList<Animal> animals)
    {
        int total = 0;
        for (Animal animal : animals)
        {
            total += animal.getLegCount();
        }
        return total/animals.size();
    }
    public String animalWithFewestLegs(ArrayList<Animal> animals)
    {
        Animal AnimalWithFewestLegs = animals.get(0);
        for (Animal animal : animals)
        {
            if (animal.getLegCount() < AnimalWithFewestLegs.getLegCount())
            {
                AnimalWithFewestLegs = animal;
            }
        }
        return AnimalWithFewestLegs.getName();
    }
}