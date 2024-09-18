public class FizzBuzz2
{
    public static void main(String args[])
    {
        int count = 30;
        System.out.println("Iterating through first 30 postive integers using FizzBuzz:");
        
        for (int i=1; i<=count; i++)
        {
            if (i%15==0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i%3==0)
            {
                System.out.println("Fizz");
            }
            else if (i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}