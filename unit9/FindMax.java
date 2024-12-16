//array, double, for loop
public class FindMax
{
    public static double FindMax(double[] values)
    {
        if (values.length == 0)
        {
            return 0;
        }
        double result = values[0];
        for (int i=0; i<values.length; i++)
        {
            if (values[i]>result)
            {
                result = values[i];
            }
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        double[] values = {1.0, 2.1, 5.3};
        double expected = 5.3;
        double result = FindMax(values);
        
        for (int i=0; i<values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        
        if (expected == result)
        {
            System.out.print("Max Value: " + result);
        }
        else
        {
            System.out.print("Incorrect max value.");
        }
        
        System.out.println(" ");
        
        double[] values2 = {0.0, -35.0, 90.1};
        double expected2 = 90.1;
        double result2 = FindMax(values2);
        
        for (int i=0; i<values2.length; i++)
        {
            System.out.print(values2[i] + " ");
        }
        
        if (expected2 == result2)
        {
            System.out.print("Max Value: " + result2);
        }
        else
        {
            System.out.print("Incorrect max value.");
        }
               
    }
    
}
