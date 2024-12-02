import processing.core.*;
import java.util.*;

public class Bounce extends PApplet // referencing back to Oval.java
{
    public void settings() // write void when we don't return anything; meaning - if a function doesn't have an output
    {
        size(400,400);
    }
    public void setup()
    {
        balls = new ArrayList<Oval>();
        balls.add(new Oval(this));
    }
    public void draw()
    {
        background(0); // black is 0, 256 is white
        for (Oval b: balls)
            b.display();
    }
    public void keyPressed()
    {
        for (int i=0; i<10; i++) // 10 iterations   
            balls.add(new Oval(this));
    }
    
    private ArrayList<Oval> balls;
    
    public static void main(String[] args)
    {
        PApplet.main("Bounce");
    }
}