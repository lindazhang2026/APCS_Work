public class isPrime
{
    static int count = 100;
    
    public static void main(String args[])
    {
        for (int n=1; n<=count; n++)
            if (isPrime(n))  
            {
                System.out.println(n);   
            }
    }
    static boolean isPrime(int n)
    {
        if (n<=1)
        {
            return false;    
        }
        for (int i = 2; i<=Math.sqrt(n); i++) // i don't get this line
        {
            if (n%i==0) // i also don't get this line
            {
                return false;
            }
        }
        return true; // why does 'else' statement create an error here?
}