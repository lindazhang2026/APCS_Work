public class TestMagicEightBall
{
    public static void main(String[] args)
    {
        magicEightBall ball = new magicEightBall();
        
        System.out.println("Will I be happy today?");
        
        System.out.println(ball.ask("Will I be happy today?"));
        
        System.out.println("Will the weather be good today?");
        
        System.out.println(ball.ask("Will the weather be good today?"));
    }
}