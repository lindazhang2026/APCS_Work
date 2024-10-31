public class startH
{
    public static boolean startH(String str)
    {
        if (str.length() < 2)
            return false;
        
        String firstTwo = str.substring(0,2);
        
        if (firstTwo.equals("hi"))
            return true;
        else
            return false;
    }
        
    public static void teststartH(String str, boolean expected)
    {
        boolean result = startH(str);
        
        System.out.println("String: " + str + "; Expected: " + expected + "; Result: " + result); //just do println for all of System.out.println() in these codes
        
        if (expected == result)
        {
            System.out.println("Correct!");
        }
            
        else
        {
            System.out.println("Incorrect!");
        }
    }
    
    public static void main(String[] args)
    {
        teststartH("hihello", true);
        teststartH("HIIIII", true); // caps don't count as true!
        teststartH("nothi", false);
        teststartH("nothi", true);
    }
        
}