public class dieRolling
{
    public static int dieRolling()
    {
        int value = (int) (Math.random()*6 + 1);
    
        return value;
    }
    public static void main(String[] args)
    {
        for (int i=0; i<=9; i++)
            System.out.println(dieRolling());
    }
}

