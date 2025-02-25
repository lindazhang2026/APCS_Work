import java.util.*;
public class PersonStatsTest
{
    public static void main(String[] args)
    {
        ArrayList<Person> pets = new ArrayList<Person>();
        pets.add(new Person("Max", 2)); 
        pets.add(new Person("Penny", 0));
        pets.add(new Person("Damon", 10));
        
        PersonStats person = new PersonStats();
        
        System.out.println("Average number of pets: ");
        System.out.println((2+10+0)/3);
        int expectedAverage = (2+10+0)/3;
        int actualAverage = person.averageNumPets(pets);
        
        if (expectedAverage == actualAverage)
        {
            System.out.println("Average number of pets correct!");
        }
        else
        {
            System.out.println("Incorrect average number of pets.");
        }
        
        System.out.println("Name of person with most pets: ");
        System.out.println("Damon");
        String expectedName = "Damon";
        String actualName = person.nameOfPerson(pets);
        
        if (expectedName.equals(actualName))
        {
            System.out.println("Name correct!");
        }
        else
        {
            System.out.println("Incorrect name.");
        }   
       
        System.out.println("Names of people with at least 2 pets: ");
        System.out.println("Max" + ", " + "Damon");
        ArrayList<String> expectedNames = new ArrayList<>(Arrays.asList("Max", "Damon")); // <String> instead of <Person> bc here you don't have both Strings and integers, which Person class has, you only have Strings
        ArrayList<String> actualNames = person.peopleArrayList(pets);
        //and this arraylist is also just names so type would be String and not Person
        if (expectedNames.equals(actualNames))
        {
            System.out.println("Names of people with more than two pets correct!");
        }
        else
        {
            System.out.println("Incorrect names of people with more than two pets.");
        }
    }
}