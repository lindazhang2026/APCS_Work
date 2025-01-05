public class CoinFlip
{
    public static String CoinFlip()
    {
        int value = (int) (Math.random()*2+1);
        if (value == 1)
        {
            return "Heads";
        }
        else
        {
            return "Tails";
        }
    }
}