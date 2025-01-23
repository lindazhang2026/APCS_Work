public class Rectangle
{
    public Rectangle(double baseIn, double heightIn)
    {
        base = baseIn;
        height = heightIn;
    }
    public double getBase()
    {
        return base;
    }
    public double getHeight()
    {
        return height;
    }
    public double Area()
    {
        return base*height;
    }
    public double Perimeter()
    {
        return (2*base) + (2*height);
    }
    public double Diagonal()
    {
        return 
    }
    private double base;
    private double height;
}