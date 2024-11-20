//accessor variables get stuff: getVar() 
//an accessor FUNCTION would be public getVar()
//constructor variables set/list things (such as an array): name = nameIn 
//member variables are declared in a class and only exist within a class?
//a public member FUNCTION takes in something like the function ask() you did and outputs something using return

//title of classes capitalized, function + variable names camel case
public class Rectangle
{
    public Rectangle(double baseIn, double heightIn) // CONSTRUCTOR needs to match CLASS NAME; needs to be capitalized
    {
        base = baseIn;
        height = heightIn; 
    }
    public double base()
    {
        return base;
    }
    public double height()
    {
        return height;
    }
    public double area() // these are public member FUNCTIONS
    {
        return base*height;
    }
    public double perimeter()
    {
        return ((2*base)+(2*height));
    }
    public double diagonal()
    {
        return Math.sqrt((height*height)+(base*base));
    }
    private double base;
    private double height;
}