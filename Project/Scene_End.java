import processing.core*;

public class Scene_End implements Scene
{
    public Scene_End(PApplet p)
    {
        this.p=p;
    }
    public void display()
    {
        p.background(255,0,0);
        p.textSize(64);
        p.textAlign(PApplet.CENTER);
        p.text("Game over.", p.width/2, p.height/2);
    }
    private PApplet p;
}