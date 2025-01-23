public class Rectangle
{
    public Rectangle(double baseIn, double heightIn)
    {
        base = baseIn;
        height = heightIn;
    }
    public double Area()
    {
        return base*height;
    }
    public double Perimeter()
    {
        return ((2*base)+(2*height));
    }
    public double Diagonal()
    {
        return Math.sqrt((height*height) + (base*base));
    }
    public double getBase()
    {
        return base;
    }
    public double getHeight()
    {
        return height;
    }
    private double base;
    private double height;
}