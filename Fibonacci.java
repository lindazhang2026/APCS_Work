public class Fibonacci
{
    public static void main(String args[])
    {
        int count = 30;
        int a = 1;
        int b = 1;
        
        System.out.println("Fibonacci Sequence");
        System.out.println(a);
      
        if (count > 1)
        {
            System.out.println(b);
        }
        
        for (int i = 1; i < count; i++)
        {
            int c = a + b;
            System.out.println(next);
            a=b;
            b=c;
        }
    }
           
}