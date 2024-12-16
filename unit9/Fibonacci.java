//array, integer, for each loop
import java.util.*;
//1,1,2,3,5,8,13
public class Fibonacci
{
    public static int[] Fibonacci(int n)
    {
        int[] sequence = new int[n]; // creating new array to store sequence OF LENGTH N
        
        if (n<=0)
        {
            return null;
        }
        
        if (n>1)
        {
            sequence[0]=0; // assign first term in array = 0
        }
        
        if (n>=2)
        {
            sequence[1]=1;
        }
        
        for (int i=2; i<n; i++)
        {
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
        return sequence;
    }
    
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(Fibonacci(2)));
        System.out.println(Arrays.toString(Fibonacci(3)));
        System.out.println(Arrays.toString(Fibonacci(4)));
        System.out.println(Arrays.toString(Fibonacci(5)));
    }
}