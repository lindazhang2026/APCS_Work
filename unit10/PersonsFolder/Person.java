public class Person
{
    private String name;
    private int num_pets;
    
    public Person(String name, int num_pets)
    {
        this.name = name;
        this.num_pets = num_pets;
    }
    
    public String getName()
    {
        return name;
    }
    public int getPets()
    {
        return num_pets;
    }
}