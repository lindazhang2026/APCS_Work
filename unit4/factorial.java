public class factorial
{
    public static int factorial(int n)
    {
        int sum = 1;
        for (int i=1; i<n+1; i++) // check n
        {
            sum *= i;
        }
        return sum;
    }
    public static void testfactorial(int n, int expected)
    {
        int result = factorial(n);
        
        System.out.println("n: " + n + "; Expected: " + expected + "; Result: " + result);
        
        if (expected == result)
        {
            System.out.println("correct!");
        }
        else
        {
            System.out.println("incorrect!");
        }
    }
    public static void main(String[] args)
    {
        testfactorial(0, 1);
        testfactorial(1, 1);
        testfactorial(2, 2);
        testfactorial(3, 6);
        testfactorial(4, 24);
        testfactorial(5, 120);
        testfactorial(6, 720);
        testfactorial(7, 5040);
    }
}