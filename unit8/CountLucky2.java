import java.util.ArrayList; // must import each time for arraylists!
import java.util.Arrays; // only needed for Arrays.asList() so only write for unit tests!

public class CountLucky2
{
    //the biggest difference between an array and an arraylist is that for the arraylist you have many different data types inside whereas for an array you can only have one
    
    public static int CountLucky2(ArrayList<Integer> nums) 
    {
        int count = 0;
        
        for (int i=0; i<nums.size(); i++) 
        {
            if ((nums.get(i)%10==7 || nums.get(i)%7==0)&& nums.get(i)!=0) // 0 is neither a multiple of 7 nor does it end in 7, however, 0/7=0, so need to specify that nums.get(i) cannot be 0
            {
                count += 1;
            }
        }
        return count;
    }
    public static void TestCountLucky2(ArrayList<Integer> nums, int expected)
    {
        int result = CountLucky2(nums);
        
        System.out.println(nums + ",");

        System.out.print("; expected: " + expected + "; result: " + result);
        
        if (result == expected)
        {
            System.out.print(" Correct");
        }
        else
        {
            System.out.print(" Incorrect");
        }
    }
    public static void main(String[] args)
    {
        TestCountLucky2(new ArrayList<Integer>(Arrays.asList(1,2,3,77,79)), 1);
        TestCountLucky2(new ArrayList<Integer> (Arrays.asList(0,77777,17,13)), 2);
    }
    
}