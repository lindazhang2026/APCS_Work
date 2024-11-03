public class frontTimes
{
    public static String frontTimes(String str, int n)
    {
        String result = "";
        int frontLen = 3;
        
        if (frontLen>str.length())
        {
            frontLen=str.length();
        }
        
        String front = str.substring(0,frontLen);
        
        for (int i=0; i<n; i++)
        {
            result += front;
        }
        return result;
    }
    public static void testfrontTimes(String str, int n, String expected)
    {
        String result = frontTimes(str, n); //result and expected must be the same type of "thing" (ie both booleans or both Strings)
            
        System.out.println("String: " + str + "; n: " + n + "; Expected: " + expected + "; Result: " + result);
        
        if (result.equals(expected))
            System.out.println("Correct!");
        else
            System.out.println("Incorrect!");
        
    }
    public static void main(String[] args)
    {
        testfrontTimes("hello", 4, "helhelhelhel");
        testfrontTimes("today", 2, "todtod");
    }
}