//array, String, for loop
import java.util.*;
public class ReverseOne
{
    public static String ReverseOne(String word) //because an array of one word, so just make it into a string
    {
        String reverse = ""; // quotation marks empty, no space

        for (int i=word.length()-1; i>=0; i--) // i-- because you are subtracting by one index everytime & i=words.length-1 because you are starting with the last index
        // CANNOT do i=0 (must be i>=0) bc its not an assignment, rather a condition that i stays positive
        {
            reverse += word.charAt(i);
        }     
        return reverse;
    }
    
    public static String[] ReverseAll(String[] words)
    {
        String [] reversedwords = new String[words.length]; // create a new array THE SAME LENGTH as the input array
        
        for (int i=0; i<words.length; i++)
        {
            reversedwords[i] = ReverseOne(words[i]); // set every word in the array reversedwords equal to its reversed version using the function ReverseOne()
        }
        return reversedwords;
    }
    
    public static void main(String[] args)
    {
        String[] words = new String[] {"abcd", "xyz"};
        
        String[] expected = new String[] {"dcba", "zyx"}; 
        
        String[] result = ReverseAll(words); // applying new function ReverseAll() to array
        
        for (int i=0; i<words.length; i++)
        {
            System.out.println("Original: " + words[i]);
        }
        

        if (Arrays.equals(expected, result)) // use .equals() when comparing the content inside arrays/arraylists, and == when comparing a location of an object inside of an array/arraylist
        {
            System.out.print("Reverse: " + Arrays.toString(result));
        }
        else
        {
            System.out.print("Incorrect.");
        }
        
        System.out.println();
        
        String[] words1 = new String[] {"1234", "5678"};
        
        String[] expected1 = new String[] {"4321", "8765"}; 
        
        String result1[] = ReverseAll(words1);
        
        for (int i=0; i<words1.length; i++)
        {
            System.out.println("Original: " + words1[i]);
        }
        

        if (Arrays.equals(expected1, result1)) 
        {
            System.out.print("Reverse: " + Arrays.toString(result1));
        }
        else
        {
            System.out.print("Incorrect.");
        }
        
        System.out.println();
        
        String[] words2 = new String[] {"racecar", "tacocat", "izzi"};
        
        String[] expected2 = new String[] {"racecar", "tacocat", "izzi"};
        
        String result2[] = ReverseAll(words2);
        
        for (int i=0; i<words2.length; i++)
        {
            System.out.println("Original: " + words2[i]);
        }
        
        if (Arrays.equals(expected2, result2)) 
        {
            System.out.print("Reverse: " + Arrays.toString(result2));
        }
        else
        {
            System.out.print("Incorrect.");
        }
    }
    
}
    