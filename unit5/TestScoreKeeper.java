public class TestScoreKeeper
{
    public static void main(String[] args)
    {
        ScoreKeeper b = new ScoreKeeper();
        
        b.scoreBonus();
        b.scoreNormal();
        b.scoreBonus();
        
        System.out.println("My score is: " + b.getTotal());
        
    }
}