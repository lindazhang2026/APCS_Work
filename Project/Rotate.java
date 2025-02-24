import processing.core.*;
import java.util.*;   // for ArrayList


public class Rotate extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        slots = new int[2][2];
    }

    public void draw()
    {
        background(0);
    }

    private int[][] slots;

    public static void main(String[] args)
    {
        PApplet.main("Rotate");
    }
}

