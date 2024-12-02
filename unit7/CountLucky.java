public class CountLucky
{
    public static int CountLucky(int[] nums)
    {
        int count = 0;
        for (int i=0; i<nums.length; i++)
        {
            if ((nums[i]%7==0 || nums[i]%10==7) && nums[i]!= 0)
            {
                count += 1;
            }
        }
        return count;
    }
    public static void TestCountLucky(int[] nums, int expected)
    {
        int result = CountLucky(nums);
        
        for (int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i] + ",");
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
    public static void main(String[] args)
    {
        TestCountLucky(new int[] {1,2,3,77,79}, 1);
        TestCountLucky(new int[] {0,77777,17,13}, 2);
    }
}