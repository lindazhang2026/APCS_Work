public class greetings
{
    public static String greetings(String name)
    {
        return "Hello, " + name + ", how are you?";
    }
    
    public static void testgreetings(String name, String expected)
    {
        String result = greetings(name);
        
        System.out.println("Name: " + name + "; Expected: " + expected + "; result: " + result);
        
        if (result.equals(expected))
        {
            System.out.println("Correct!");
        }
            
        else
        {
            System.out.println("Incorrect!");
        }
        
    }
    public static void main(String[] args)
    {
        testgreetings("Briley", "Hello, Briley, how are you?");
        testgreetings("Linda", "Hello Linda how are you?");
    }
    
}