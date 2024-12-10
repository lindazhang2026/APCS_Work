import java.util.ArrayList;
import java.util.Arrays;

public class CountZNames2
{
    public static int CountZNames2(ArrayList<String> names)
    {
        int count = 0;
        
        for (int i=0; i<names.size(); i++)
        {
            if (names.get(i).startsWith("Z") || names.get(i).startsWith("z"))
            {
                count += names.get(i).length(); // .length() instead of .size() because you are iterating through the strings themselves inside the arraylist, not the items of the arraylist directly
            }
        }
        return count;
    }
    public static void TestCountZNames2(ArrayList<String> names, int expected)
    {
        int result = CountZNames2(names);
        
        System.out.println(names + ",");
        
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
        TestCountZNames2(new ArrayList<String> (Arrays.asList("Dr. Kessner", "Dr. Sands")), 0);
        TestCountZNames2(new ArrayList<String> (Arrays.asList("Zorro", "zero", "zippy")), 14);
    }
}