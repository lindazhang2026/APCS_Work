public class Count7
{
    public static int CountLucky(int[] nums)
    {
        int count = 0;
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i]%7==0 || nums[i]%10==7)
            {
                count += 1;
            }
        }
        return count;
    }
}

public class SumOfSquares
{
    public static double SumOfSquares(double[] nums)
    {
        double sum = 0;
        
        for (int i=0; i<nums.length; i++)
        {
            sum += nums[i]*nums[i]; // NUMS[i] * NUMS[i]!
        }
        
        return sum;
    }
}

public class TotalZ
{
    public static int TotalZ(String[] names)
    {
        int count = 0;
        for (int i=0; i<names.length; i++) // .length bc accessing each item in array not the content of the items which are strings so not .length()
        {
            if (names[i].startsWith("z") || names[i].startsWith("Z"))
            {
                count += names[i].length(); // .length() here bc you are accessing the inside of the strings themselves
            }
        }
        return count;
    }
}