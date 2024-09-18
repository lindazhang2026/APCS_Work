public class Squares
{
    public static void main(String args[])
    {
        int count = 10;
        System.out.println("First 10 terms in a sequence of squares:");
        
        for (int i=1; i<=count; i++)
        {
            int square = i * i;
            System.out.println(square);
        }
    }
}