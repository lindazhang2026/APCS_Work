public class icyHot
{
    public static boolean icyHot(int temp1, int temp2)
    {
        if ((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void testIcyHot(int temp1, int temp2, boolean expected)
    {
        boolean result = icyHot(temp1, temp2);
        
        System.out.print("temp1: " + temp1 + "; temp2: " + temp2 + "; expected: " + expected + "; result: " + result + "; ");
        
        if (result == expected)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Incorrect.");
        }
    }
    public static void main(String[] args)//why does [] go after string? do we need to know this for quiz
    {
        testIcyHot(3, 0, false);
        testIcyHot(-1, 200, true);
        testIcyHot(-100, 0, false);
        testIcyHot(10000, -1, true);
    }
}