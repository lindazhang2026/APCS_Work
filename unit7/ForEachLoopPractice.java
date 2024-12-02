public class ForEachLoopPractice
{
    public static int Count7(int[] nums)
    {
        int count = 0;
        
        for (int num : nums) // num is the replacement for nums[i]
            if (num%7==0 || num%10==7) // so here you would just use num instead of nums[i]
            {
                count +=1;
            }
        }
        return count;  
        
    }
}


public class SumOfSquares // is this how you do a for each loop
{
    public static double SumOfSquares(double[] nums)
    {
        double sum =0;
        
        for (double num : nums)
        {
            sum += num*num;
        }
        
        return sum;
    }
}

public class TotalZ
{
    public static int TotalZ(String[] nums)
    {
        int count = 0;
        
        for (String num : nums)
        {
            if (num.startsWith("z") || num.startsWith("Z"))
            {
                count += num.length();
            }
        }
        return count;
    }
}

