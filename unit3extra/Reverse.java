public class Reverse
{
    public static String Reverse(String str)
    {
        String empty = "";
        for (int i=str.length()-1; i>=0; i--)
        {
            empty += str.substring(i,i+1); //adding each i
        }
        return empty;
    }
}