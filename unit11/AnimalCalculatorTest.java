import java.util.*;
public class AnimalCalculatorTest
{
    public static void main(String[] args)
    {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Human("Katie", 2, false));
        animals.add(new Cat("Gaby", 4, true));
        animals.add(new Sponge("Bob", 2, false));
        animals.add(new Centipede("Joe", 100, false));
        
        AnimalCalculator animalcalculator = new AnimalCalculator();
        // line above creates an object of AnimalCalculator type/class to call the AnimalCalculator class's methods!
        
        System.out.println("Average Leg Count: ");
        
        System.out.println(animalcalculator.averageLegCount(animals)); 
        
        System.out.println("Name of animal with fewest legs: ");
        
        System.out.println(animalcalculator.animalWithFewestLegs(animals)); // SIDE NOTE: I realise that there are two objects that have the same amount of legs (human and sponge bob) but I have no clue as to how to make both of their names appear when the method "animalWithFewestLegs()" is run.
        
    }
    
}