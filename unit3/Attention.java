public class Attention
{
    public static boolean Attention(String str)
    {
        if (str.length() < 8)
        {
            return false;
        }
        String front = str.substring(0,8); // REMEBER TO DECLARE!!! ALSO REMEMBER THAT BOXES START AT 0 SO IT SHOULD BE 7 AS THE LAST NUMBER OF THE SUBSTRING SO n+1 WOULD BE 8 AND NOT 9
        
        if (front.equals("Hey you!"))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void testAttention(String str, boolean expected)
    {
        boolean result = Attention(str);
        
        System.out.println("String: " + str + "; Expected: " + expected + "; Result: " + result);
        
        if (result == expected)
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
        testAttention("Hey you! How are you?", true);
        testAttention("Hello! How are you?", true);
    }
}