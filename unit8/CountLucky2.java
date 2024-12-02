import java.util.ArrayList;

public class CountLucky2
{
    //the biggest difference between an array and an arraylist is that for the arraylist you hace have many different data types inside whereas for an array you can only have one
    
    public static ArrayList<Integer> CountLucky2(ArrayList<Integer> nums)
    {
        int count = 0;
        
        for (int i=0; i<nums.size(); i++) // array so .length not .size()
        {
            if (nums[i]==7)
            {
                count += 1;
            }
        }
        return count;
    }
    public static void TestCountLucky2(ArrayList<Integer> nums, int expected)
    {
        int result = CountLucky2(nums);
        
        for (int i=0; i<nums.size(); i++)
        {
            System.out.println(nums + ",");
        }
        
        System.out.print("; expected: " + expected + "; result: " + result);
        
        if (result == expected)
        {
            System.out.print("Correct");
        }
        else
        {
            System.out.print("Incorrect");
        }
    }
    public static void main(String[] args)
    {
        TestCountLucky2(new ArrayList<Integer> {1,2,3,77,79}, 1);
        TestCountLucky2(new ArrayList<Integer> {0,77777,17,13}, 2);
    }
    
}