public class goodDeal
{
    public static boolean goodDeal(double originalPrice, double salePrice)
    {
        if (salePrice < 0.75*originalPrice && salePrice >= 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void testgoodDeal(double originalPrice, double salePrice, boolean expected)
    {
        boolean result = goodDeal(originalPrice, salePrice);
        
        System.out.println("Original price: " + originalPrice + "; Sale Price: " + salePrice + "; Expected: " + expected + "; Result: " + result);
        
        if (expected == result)
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
        testgoodDeal(100, 200, true);
        testgoodDeal(50, 25, true);
        testgoodDeal(50, 25, false);
        testgoodDeal(100, 200, true);
    }
}