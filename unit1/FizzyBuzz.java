public class FizzyBuzz
{
    public static void main(String args[])
    {
       int term = 3;
        for (int i=1; i<=30; i++)
        {
            if (i%5 == 0)
            {
                System.out.println("FizzyBuzz");
            }
            else
            {
                System.out.println(i*3);
            }
        }
    }
}