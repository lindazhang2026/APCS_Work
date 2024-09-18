public class Fibonacci4
{
    public static void main(String args[])
    {
        int count = 10;
        int a = 1;
        int b = 1;
        System.out.println(a);
        
        if (count >1)
        {
            System.out.println(b);
            
        }
        
        for (int i=2; i <count; i++)
        {
            a = a+b;
            System.out.println(a);
            b=a-b;
        }
    }
}