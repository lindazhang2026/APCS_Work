public class Acronym
{
    public static String Acronym(String[] words)
    {
        String added = "";
        
        for (int i=0; i<words.length; i++)
        {
            added += words[i].substring(0,1);
        }
        
        return added;
    }

    public static void main(String[] args)
    {
        System.out.println(Acronym(new String[] {"International", "Bank", "Money"}));
    }
}