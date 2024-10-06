public class isVampire
{
    public static boolean isVampire(float hour, boolean awake) // why "BOOLEAN isVampire"? Not all variables are booleans tho? 
    // also does the order of the float/boolean matter in the parenthesis?
    {
        if (awake && (hour >=6 && hour <= 22) || (hour < 6 && hour > 22))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void testisVampire(float hour, boolean awake, boolean expected)
    {
        boolean result = isVampire(hour, awake);
        
        System.out.println("Hour: " + hour + "; Awake: " + awake + "; Expected: " + expected + "; Result: " + result);
        
        if (result == expected)
        {
            System.out.println("Correct!");
        }
        else 
        {
            System.out.println("Incorrect!");
        }
        
    }
    public static void main (String[] args)
    {
        testisVampire(50, true, true);
        testisVampire(0, true, false);
        testisVampire(22, false, false);
        testisVampire(100, false, true);
    }
}
