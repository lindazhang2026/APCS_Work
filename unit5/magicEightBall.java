public class magicEightBall //Always capitalize class titles but camel case variable names
{
    private final String[] replies =
    {
        "It is certain",
        "It is decidedly so",
        "Without a doubt",
        "Yes definitely",
        "You may rely on it",
        "As I see it, yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes",
        "Reply hazy, try again",
        "Ask again later",
        "Better not tell you now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don’t count on it",
        "My reply is no",
        "My sources say no",
        "Outlook not so good",
        "Very doubtful"
    };
    public String ask(String question)
    {
        int input = (int) (Math.random() * replies.length);
        return replies[input];
    }
    
}