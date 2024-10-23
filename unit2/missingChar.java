public class missingChar
{
    public static String missingChar(String str, int n)
    {
        String front = str.substring(0,n);
        String back = str.substring(n+1, str.length());
        return front + back;
    }
    
    public static void testmissingChar(String str, int n, String expected) // void test_function no need to declare string/boolean before the test_function b/c you already declared it in the original (first) function; ALSO "VOID" THIS FUNCTION (b/c nothing to return but you can make System.out.print() statements!) 
    {
        String result = missingChar(str, n);
        
        System.out.println("String: " + str + "; n: " + n + "; expected: " + expected + "; result: " + result);
        
        if (expected.equals(result)) // FOR STRING COMPARISONS YOU MUST DO .equals() NOT ==
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Incorrect!");
        }
    }
    
    public static void main (String[] arg) // regular function no declaration in this line; PUBLIC STATIC VOID MAIN(STRING() ARG)
    {
        testmissingChar("hello", 3, "helo");
        testmissingChar("HELPME", 5, "HELPM");
        testmissingChar("kate", 0, "kae");
        testmissingChar("kate", 0, "k");
    }
}