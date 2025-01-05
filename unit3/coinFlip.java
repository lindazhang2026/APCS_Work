public class coinFlip
{
    public static String coinFlip()
    {
        int value = (int) (Math.random()*2+1);
            
        if (value==1)
        {
            return "Heads";
        }
        if (value==2)
        {
            return "Tails";
        }
        //else
        return "";
    }
    public static void main(String[ ] args)
    {
        for (int i=0; i<=19; i++) // 20 outputs
        {
            System.out.println(coinFlip());
        }
    }
}