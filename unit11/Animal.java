public class Animal
{
    private String name;
    private int legcount;
    private boolean furry;
    
    public Animal(String name, int legcount, boolean furry)
    {
        this.name = name;
        this.legcount = legcount;
        this.furry = furry;
    }
    public String getName()
    {
        return name;
    }
    public int getLegCount()
    {
        return legcount;
    }
    public boolean getFurriness()
    {
        return furry;
    }
}