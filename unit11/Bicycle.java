public class Bicycle implements Vehicle
{
    private String name;
    private int wheels;
    private boolean humanpowered;
    
    public Bicycle(String name, int wheels, boolean humanpowered)
    {
        this.name = name;
        this.wheels = wheels;
        this.humanpowered = humanpowered;
    }
    public String name()
    {
        return name;
    }
    public int wheelCount()
    {
        return wheels;
    }
    public boolean isHumanPowered()
    {
        return humanpowered;
    }
}