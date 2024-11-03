public class sumOfSquares
{
    public static int sumOfSquares(int n)
    {
        int sum = 0;
        for (int i=0; i<n+1; i++) //(0,n+1) -> if n=3: 0,1,2,3
        {
            sum += (i*i);
        }
        return sum;
    }
    public static void testsumOfSquares(int n, int expected)
    {
        int result = sumOfSquares(n);
        
        System.out.println("n: " + n + "; Expected: " + expected + "; Result: " + result);
        
        if (result==expected)
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
        testsumOfSquares(1,1);
        testsumOfSquares(2,5);
        testsumOfSquares(3,14);
        testsumOfSquares(0,0);
        testsumOfSquares(4,30);
    }
}
