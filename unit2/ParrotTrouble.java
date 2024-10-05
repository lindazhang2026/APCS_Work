public class ParrotTrouble
{
    public static boolean ParrotTrouble(boolean talking, int hour)
    {
        if (talking && (hour >=0 && hour < 7) || (hour > 20 && hour <= 23))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void testParrotTrouble(boolean talking, int hour, boolean expected)
    {
        boolean result = ParrotTrouble(talking, hour);
        
        System.out.println("Talking: " + talking + "; Hour: " + hour + "; Expected: " + expected + "; Result: " + result);
        
        if (result == expected)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Incorrect!");
        }
    }
    public static void main(String[] args)
    {
        testParrotTrouble(true, 200, true); 
        testParrotTrouble(true, 10, false);
        testParrotTrouble(false, 25, false);
        testParrotTrouble(false, -30, true);
    }
}

