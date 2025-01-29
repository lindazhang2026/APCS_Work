import processing.core*;

public class Scene_Play implements Scene
{
    public Scene_Play(PApplet p)
    {
        this.p=p;
    }
    public void display()
    {
        p.background(0);
        p.fill(0,255,0);
        p.ellipse(p.width/2, p.height/2, 50, 50);
    }
    private PApplet p;
}