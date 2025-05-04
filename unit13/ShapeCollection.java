import java.util.*;

public class ShapeCollection
{
    private ArrayList<Shape> shapes;
    
    public ShapeCollection()
    {
        shapes = new ArrayList<>();
    }
    
    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }
    
    public int numberOfSides(String shapeName)
    {
        for (Shape s : shapes)
        {
            if (s.getName().equalsIgnoreCase(shapeName))
            {
                return s.getSides();
            }
        }
        return -1;
    }
    
    public double averageSides()
    {
        if (shapes.isEmpty())
        {
            return 0;
        }
        int total = 0;
        for (Shape s : shapes)
        {
            total += s.getSides();
        }
        return (double) total / shapes.size();
    }
    
    public ArrayList<Shape> evenSidedShapes()
    {
        ArrayList<Shape> evenShapes = new ArrayList<>();
        for (Shape s : shapes)
        {
            if (s.getSides() % 2 == 0)
            {
                evenShapes.add(s);
            }
        }
        return evenShapes;
    }

    
    //test
    
    public static void main(String[] args)
    {
        ShapeCollection collection = new ShapeCollection();
        collection.addShape(new Shape("triangle",3));
        collection.addShape(new Shape("square",4));
        collection.addShape(new Shape("hexagon",6));
        
        System.out.println("Sides in square: " + collection.numberOfSides("square"));
        System.out.println("Average sides: " + collection.averageSides());
        System.out.println("Even sided shapes: ");
        for (Shape s : collection.evenSidedShapes())
        {
            System.out.println(s.getName());
        }
    }
}

