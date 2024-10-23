public class isVamp
{
    public static void main(String[] args)
    {
    public static boolean isVamp(float hour, boolean awake)
    {
    if (awake && (hour <= 6 || hour >= 22))
    {
        return true;
    }
    if (!awake && (hour > 6 && hour < 22))
    {
        return true;
    }
    else 
    {
        return false;  
    } 
    }
        
    }
}