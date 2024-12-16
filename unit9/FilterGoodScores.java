//arraylist, integer, for each loop
import java.util.ArrayList;
import java.util.Arrays;

public class FilterGoodScores
{
    public static ArrayList<Integer> FilterGoodScores(ArrayList<Integer> scores) // FUNCTION DECLARATION CANNOT BE INT; NEEDS TO BE ARRAYLIST<INTEGER>
    {  
        ArrayList<Integer> filtered = new ArrayList<>(); //THIS FORMAT WHEN CREATING NEW ARRAYLIST!!!!
        for (int score : scores)
        {
            if (score > 90)
            {
                filtered.add(score);
            }
        }
        return filtered;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(51, 52, 53, 100));
        
        for (int score : scores)
        {
            System.out.print(score + " ");
        }
        
        ArrayList<Integer> expected = new ArrayList<> (Arrays.asList(100));
        ArrayList<Integer> result = FilterGoodScores(scores);
        
        if (expected.equals(result)) // COMPARING ARRAYLISTS WITH .EQUALS()
        {
            System.out.print("Scores over 90: " + result);
        }
        else
        {
            System.out.print("Incorrect.");
        }
        
        System.out.println(" ");
        
        ArrayList<Integer> scores2 = new ArrayList<>(Arrays.asList(92,89,90,99));
        
        for (int score: scores2)
        {
            System.out.print(score + " ");
        }
        
        ArrayList<Integer> expected2 = new ArrayList<> (Arrays.asList(92,99));
        ArrayList<Integer> result2 = FilterGoodScores(scores2);
        
        if (expected2.equals(result2))
        {
            System.out.print("Scores over 90: " + result2);
        }
        else
        {
            System.out.print("Incorrect.");
        }
    }
}