public class ArrayComputations {
    public static int findSmallest(int[][] arr)
    {
        int min = Integer.MAX_VALUE;
        for (int[] row : arr)
        {
            for (int num : row)
            {
                if (num < min) 
                {
                    min = num; 
                }
            }
        }
        return min;
    }
        
        public static float sum2DArray(float[][] arr)
        {
            float sum = 0;
            for (float[] row : arr)
            {
                for (float num : row)
                {
                    sum += num;
                }
            }
            return sum;
        }
        
        public static int countStringsStartingWithA(String[][] arr)
        {
            int count = 0;
            for (String[] row : arr)
            {
                for (String s : row)
                {
                    if (s.startsWith("A"))
                    {
                        count++;
                    }
                }
            }
            return count;
        }
        
        // test
        
        public static void main (String[] args)
        {
            int[][] testIntArray = {{3,5},{7,1}};
            System.out.println("Smallest: " + findSmallest(testIntArray));
            
            float[][] testFloatArray = {{1.5f, 2.5f}, {3.0f, 4.0f}};
            System.out.println("Sum: " + sum2DArray(testFloatArray));
            
            String[][] testStringArray = {{"apple", "banana"}, {"avocado", "cherry"}};
            
            System.out.println("Count starting with A: " + countStringsStartingWithA(testStringArray));
        }
    }