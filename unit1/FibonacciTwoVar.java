public class FibonacciTwoVar
{
    public static void main(String args[])
    {
        int count = 30;
        int a = 1;
        int b = 1;
        
        System.out.println("Fibonacci with only two variables");
        System.out.println(a);
        
        if (count > 1)
        {
            System.out.println(b);
        }
        
        for (int i = 2; i < count; i++)
        {
            a += b;
            System.out.println(a);
            
            b = a - b;
        }
        
    }
}