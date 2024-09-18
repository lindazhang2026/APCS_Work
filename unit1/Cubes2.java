public class Cubes2
{
    public static void main(String args[])
    {
        int count = 6;
        System.out.println("First 6 terms in a sequence of cubes:");
        
        for (int i=1; i<=count; i++)
        {
            int cube = i * i * i;
            System.out.println(cube);
        }
    }
}