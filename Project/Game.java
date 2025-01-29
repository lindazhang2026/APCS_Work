import processing.core*;
import java.util*;

public class Game extends PApplet{
    public void Settings()
    {
        size(1000,1000);
    }
    public void setup()
    {
        scenes = new ArrayList<Scene>();
        scenes.add(new Scene_Start(this));
        scenes.add(new Scene_Play(this));
        scenes.add(new Scene_End(this));
        
        current =0;
    }
    public void draw()
    {
        background(0);
        scenes.get(current).display();
    }
    public void keyPressed()
    {
        current++;
        if (current >= scenes.size())
        {
            current = 0;
        }
    }
    private ArrayList<Scene> scenes;
    private int current;
    
    public static void main(String[] args)
    {
        PApplet.main("Game");
    }
}