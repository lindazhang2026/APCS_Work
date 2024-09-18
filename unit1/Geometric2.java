public class Geometric2
{
    public static void main(String args[])
    {
        int count = 15; 
        int term = 1; // //can also use 'long' instead of 'int' so the output after a few numbers doesn't become so large it's negative (remeber to add L after the number.)
        
        //THE LINE INT TERM DIRECTLY TELLS U WHAT THE FIRST INPUT TERM IS; THE LINE INT i=1 IS JUST HYPOTHETICAL
        System.out.println("First 15 numbers in a geometric sequence with a common ratio of 10:");
        
        for (int i=1; i<=count; i++)
        {
            System.out.println(term); // print out 'term' first since it's already set to 1
            term *= 10; // updating 'term'
        }
    }
}