public class SumOfSquares
{
    public static double SumOfSquares(double[] nums)
    {
        double sum = 0;
        for (int i=0; i<nums.length; i++) // keep as int i=0 not double
        {
            sum += nums[i]*nums[i];
        }
        return sum;
    }
    public static void TestSumOfSquares(double[] nums, double expected)
    {
        double result = SumOfSquares(nums);
        
        for (int i=0; i<nums.length; i++) // must use for loop to print array
        {
            System.out.print(nums[i] + ","); // no ln for horizontal array print
        }
        
        System.out.println("; expected: " + expected + "; result: " + result);
        
        if (result == expected)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect");
        }
        
    }
    public static void main(String[] args) // new int[] {} instead of [] to list an array
    {
        TestSumOfSquares(new double[] {1.0,2.9,3.0}, 18.41);
        TestSumOfSquares(new double[] {1.01, 18.0}, 325.0201);
    }
}