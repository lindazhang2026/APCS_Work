public class ScoreKeeper
{
    public Scorekeeper()
    {
        score = 0;
    }
    
    public void scoreNormal()
    {
        Score += 100;
    }
    
    public void scoreBonus()
    {
        Score += 1000;
    }
    public int getTotal()
    {
        return Score;
    }
    
    private int Score;
}