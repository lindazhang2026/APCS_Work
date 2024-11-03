public class reverse
{
    public static String reverse(String str)
    {
        String result = "";
        for (int i=str.length()-1; i>=0; i--) //you start with the last character in the index
        // i >= 0 bc it will loop as long as nonnegative
        {
            result += str.substring(i,i+1); //just add i 
        }
        return result;
    }
    public static void testreverse(String str, String expected)
    {
        String result = reverse(str);
        
        System.out.println("String: " + str + "; Expected: " + expected + "; Result: " + result);
        
        if (result.equals(expected))
        {
            System.out.println("correct!");
        }
        else
        {
            System.out.println("incorrect!");
        }
    }
    public static void main(String[] args)
    {
        testreverse("bad", "dab");
        testreverse("Hello, world!", "!dlrow ,olleH");
        testreverse("tacocat", "tacocat");
        testreverse("good", "doog");
        testreverse(" .", ". ");
    }
}