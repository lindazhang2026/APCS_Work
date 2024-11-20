public class TestRectangle
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(2,3);
    
        System.out.println("Base: " + rect.base());
        System.out.println("Height: "+ rect.height());
        System.out.println("Area: "+ rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("Diagonal: "+ rect.diagonal());
    
    }
}