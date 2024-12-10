import java.util.ArrayList;
import java.util.Arrays;

public class SumOfSquares2
{
    public static double SumOfSquares2(ArrayList<Double> nums)
    {
        double count = 0;
        
        for (int i=0; i<nums.size(); i++)
        {
            count += ((nums.get(i)) * (nums.get(i)));
        }
        return count;
    }
    public static void TestSumOfSquares2(ArrayList<Double> nums, double expected)
    {
        double result = SumOfSquares2(nums);
        
        System.out.println(nums + ",");
        
        System.out.println("Expected: " + expected + "; Result: " + result); 
        
        if (result==expected)
        {
            System.out.print(" Correct!");
        }
        else
        {
            System.out.print(" Incorrect!");
        }
    }
    public static void main(String[] args)
    {
        TestSumOfSquares2(new ArrayList<Double> (Arrays.asList(0.0)), 0.0); // because double so instead of 0 it needs to be 0.0!
        TestSumOfSquares2(new ArrayList<Double> (Arrays.asList(1.0,2.0,3.0)), 14.0);
        TestSumOfSquares2(new ArrayList<Double> (Arrays.asList(2.0,2.0,2.0)), 12.0);
    }
}