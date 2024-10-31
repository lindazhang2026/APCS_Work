public class mathrandomtest
{
    public static String mathrandomtest()
    {
        int value = (int) (Math.random()*3+1); // random # btween 1 to 3; YES, THIS FUNCTION DOES ONLY PRINT VALUES BETWEEN 1 AND 3 INCLUSIVE
        
        if (value == 1)
        {
            return "One";
        }
        if (value ==2)
        {
            return "Two";
        }
        if (value ==3)
        {
            return "Three";
        }
        else
        {
            return "Other than one/two/three";
        }
            
    }
    public static void main(String[] args)
    {
        for (int i=0; i<=19; i++)
        {
           System.out.println(mathrandomtest()); 
        }
    }
        
}