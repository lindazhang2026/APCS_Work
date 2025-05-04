class Rectangle
{
    private String name;
    private double width, height;

    public Rectangle(String name, double width, double height)
    {
        this.name = name;
        this.width = width;
        this.height = height;
    }
    
    public String getName() 
    {
        return name; 
    }
    public double getWidth() 
    { 
        return width; 
    }
    public double getHeight() 
    { 
        return height; 
    }
    
    public double getArea() 
    {
        return width * height;
    }

    public double getPerimeter() 
    {
        return 2 * (width + height);
    }
}
    
    public class RectangleArray {

    public static double averagePerimeter(Rectangle[][] arr) 
    {
        double total = 0;
        int count = 0;
        for (Rectangle[] row : arr) {
            for (Rectangle r : row) {
                total += r.getPerimeter();
                count++;
            }
        }
        return total / count;
    }
        
    public static Rectangle findGreatestArea(Rectangle[][] arr) 
    {
        Rectangle maxRect = arr[0][0];
        for (Rectangle[] row : arr) {
            for (Rectangle r : row) {
                if (r.getArea() > maxRect.getArea()) {
                    maxRect = r;
                }
            }
        }
        return maxRect;
    }
    
    //test
        
    public static void main(String[] args) 
    {
        Rectangle[][] rects = {
            {new Rectangle("A", 2, 3), new Rectangle("B", 3, 3)},
            {new Rectangle("C", 4, 5), new Rectangle("D", 2, 7)}
        };

        System.out.println("Average Perimeter: " + averagePerimeter(rects));
        Rectangle biggest = findGreatestArea(rects);
        System.out.println("Biggest Rectangle: " + biggest.getName() + " with area " + biggest.getArea());
    }
}

