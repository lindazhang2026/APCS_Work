import java.util.*;
public class PersonStats
{
    public int averageNumPets(ArrayList<Person> pets)
    {
        int total = 0; 
        for (Person pet : pets)
        {
            total += pet.getPets();
        }
        return total/pets.size();
    }
    public String nameOfPerson(ArrayList<Person> persons)
    {
        Person PersonWithMostPets = persons.get(0);
        for (Person person : persons)
        {
            if (person.getPets() > PersonWithMostPets.getPets())
            {
                PersonWithMostPets = person;
            } 
        }
        return PersonWithMostPets.getName();
    }
    public ArrayList<String> peopleArrayList(ArrayList<Person> people_names) 
    {
        ArrayList<String> ArrayList_OutputtedOfPeopleNames = new ArrayList<>(); //your output arraylist!
        for (Person name : people_names)
        {
            if (name.getPets() >= 2)
            {
                ArrayList_OutputtedOfPeopleNames.add(name.getName());
            }
        } 
        return ArrayList_OutputtedOfPeopleNames;
    }
}