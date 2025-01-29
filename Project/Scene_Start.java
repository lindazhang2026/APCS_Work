import processing.core*;

public class Scene_Start implements Scene
{
    public Scene_Start(PApplet p)
    {
        this.p=p;
    }
    public void display()
    {
        p.background(0,0,255);
        p.textSize(64);
        p.textAlign(PApplet.CENTER);
        p.text("Welcome to the Coin Collector!", p.width/2, p.height/2);
    }
    private PApplet p;
}