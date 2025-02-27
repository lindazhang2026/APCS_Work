public class AnimalCodeTest
{
    public static void main(String[] args)
    {
        System.out.println("Testing the subclasses of Animal: ");
        
        Human human = new Human("Katie", 2, false); // creating new objects of type: name of each subclass (or I could just use name of superclass, Animal)
        Cat cat = new Cat("Gaby", 4, true);
        Sponge sponge = new Sponge("Bob", 2, false);
        Centipede centipede = new Centipede("Joe", 100, false);
        
        System.out.println("Human name: " + human.getName() + "; Cat name: " + cat.getName() + "; Sponge name: " + sponge.getName() + "; Centipede name: " + centipede.getName());     
    }
}