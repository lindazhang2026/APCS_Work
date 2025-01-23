public class ScoreKeeper
{
    public ScoreKeeper()
    {
        Score = 0;
    } 
    public void scoreNormal()
    {
        Score += 10;
    }
    public void scoreBonus()
    {
        Score += 1000;
    }
    public int getTotal()
    {
        return Score;
    }
    private int score;
}