public class CountZNames
{
    public static int CountZNames(String[] names)
    {
        int count = 0;
        for (int i=0; i<names.length; i++)
        {
            if (names[i].startsWith("Z")|| names[i].startsWith("z"))
            {
                count += names[i].length(); // for strings is .length()
            }
        }
        return count;
    }
    public static void TestCountZNames(String[] names, int expected)
    {
        int result = CountZNames(names);
        
        for (int i=0; i<names.length; i++)
        {
            System.out.print(names[i] + ",");
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
    public static void main(String args[])
    {
        TestCountZNames(new String [] {"Zella", "Zoo", "Hi"}, 8);
        TestCountZNames(new String [] {"Zzz", "Candy", "zara", "jazz"}, 7);
    }
}