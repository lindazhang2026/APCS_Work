public class Loops
{
    public static void main(String[] args)
    {
        System.out.println("Loops");

        // initialization: int i=0
        // condition: i<10
        // update: i++

        // || means or
        // && means and

        for (int i=0; i<10; i++)
        {
            if (i%2 == 0)
            {
                System.out.println("Even");
            }
            else if (i == 7 || i == 3)
            {
                System.out.println("Lucky");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}

