public class ArrayExercises {
    public static void main (String[] args)
    {
        int [][] diagonal = new int[10][10];
        for (int i=0; i<10; i++)
        {
            diagonal[i][i] = 1;
        }
        
        System.out.println("Diagonal Array: ");
        printIntArray(diagonal);
        
        String[][] stringArray = 
        {
            {"apple", "banana"},
            {"carrot", "date"}
        };
        
        System.out.println("\nString Array: ");
        
        printStringArray(stringArray);
        
        double[][] doubleArray = new double[5][5];
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                doubleArray[i][j] = (i+1)*10 + (j+1);
            }
        }
        
        System.out.println("\nDouble Array: ");
        printDoubleArray(doubleArray);
        
        int[][] sameRowArray = new int[6][5];
        
        for (int i=0; i<6; i++)
        {
            for (int j=0; j<5; j++)
            {
                sameRowArray[i][j] = i+1;
            }
        }
        
        System.out.println("\nSame Row Array");
        printIntArray(sameRowArray);
    }
    
    // tests
    
    static void printIntArray(int[][] arr)
    {
        for (int[] row : arr)
        {
            for (int num : row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    static void printDoubleArray(double[][] arr) {
        for (double[] row : arr) {
            for (double num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static void printStringArray(String[][] arr) {
        for (String[] row : arr) {
            for (String s : row) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}

    
