public class ParrotTrouble
{
    public static boolean ParrotTrouble(boolean talking, int hour)
    {
        if (talking && ((hour >=0 && hour < 7) || (hour > 20 && hour <= 23))
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
        boolean result = ParrotTrouble(boolean talking, int hour);
        
        System.out.println("Talking: " + boolean talking + "; Hour: " + int hour + "; Expected: " + boolean expected + "; Result: ")
    }
}

