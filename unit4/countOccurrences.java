public class countOccurrences
{
    public static int countOccurrences(String str, String part)
    {
        int count = 0;
        for (int i=0; i<str.length() - part.length(); i++)
        //if str = "hello" & part = "ll" -> 1
        //str.length()=5; part.length()=2 
        //5-2=3 -> (0,3) -> indicies 0,1,2 -> hel
        //I'm confused.
        {
            if (str.substring(i,i+part.length()).equals(part))
            {
                count+=1;
            }
        }
        return count;
    }
    public static void testcountOccurrences(String str, String part, int expected)
    {
        int result = countOccurrences(str, part);
        System.out.println("String: " + str + "; part: " + part + "; expected: " + expected + "; result: " + result);
        
        if (expected == result)
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
        testcountOccurrences("Mississippi", "iss", 2);
        testcountOccurrences("banananana", "na", 4);
        testcountOccurrences("lalalalala", "la", 5);
        testcountOccurrences("nope", "he", 0);
    }
}