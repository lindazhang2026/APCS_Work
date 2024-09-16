public class Fibonacci2
{
    public static void main(String args[])
    {
        int count = 30;
        int term = 1;
        int term2 = 1; // both defined as 1
        System.out.println("Print out first 30 terms in Fibonacci:");
        
        System.out.println(term); // print out initial term 1
        
        if (count > 1)
        {
            System.out.println(term2); // then print out second value of 1 when there is more than 1 term
        }
        
        for (int i=0; i<count-2; i++) // int i=2 in this case doesn't reference the integer itself being inputed into the loop RATHER it stands for the number of repetition it has gone through and COUNT would be how many more reps you still need
            
        {
            term += term2; // update first
            System.out.println(term); // then print term
            term2 = term - term2; // new term updated to become old term; b= a - b
        }
    }
}