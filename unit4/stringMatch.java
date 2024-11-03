public class stringMatch
{
    public static int stringMatch(String a, String b)
    {
        int count =0; 
        int n = Math.min(a.length(), b.length());
        
        for (int i=0; i<n-1; i++)
        {
            String aSub = a.substring(i,i+2);
            String bSub = b.substring(i,i+2);
            if (aSub.equals(bSub))
            {
                count +=1;
            }
        }
        return count;
    }
    public static void teststringMatch(String a, String b, int expected) // DO NOT COMPLICATE THINGS BY ADDING A DECLARATION IN THIS LINE!!! Instead add 'void'
    {
        int result = stringMatch(a,b);
        
        System.out.println("String a: " + a + "; String b: " + b + "; Expected: " + expected + "; Result: " + result);
        
        if (result==expected)
        {
            System.out.println("correct!");
        }
        else
        {
            System.out.println("incorrect!");
        }
    }
    public static void main(String[] args)
    {
        teststringMatch("hi", "hello", 0); 
        teststringMatch("cake", "brake", 0);
    }
}

//i=0: (0,2) -> "ca" + "br"
//i=1: (1,3) -> ak + ra
//i=2; (2,4) -> ke + ak
//why even though i pressed cmd + s it still shows in terminal my old code???