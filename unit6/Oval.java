import processing.core.*;

public class Oval
{
    public Oval(PApplet o) // a constructor
    {
        //use PVector for position, velocity, acceleration
        //p.color(r,g,b) from 0 to 255 or just do 256 for all
        this.o = o; // 'this' makes it clear that the object p exists only in this class and the variable p can be accessed in other functions
        position = new PVector(200,200); // (200,200) is center bc screen is (400,400)
        velocity = new PVector(o.random(-2,2), o.random(-2,2)); // PVector(x,y) generates random speeds for the x and y axis between -3 and 3
        radius = o.random(1,20);
        c=o.color(o.random(256), o.random(256), o.random(256));    
    }
    public void display()
    {
        o.fill(c);
        o.ellipse(position.x, position.y, radius*2, radius*4);
        // .ellipse(x,y,width,height)
        position.add(velocity);
        if (position.x < radius || position.x > o.width-radius)
            velocity.x *=-1; // reverses the ball's direction
        if (position.y < radius*2 || position.y > o.height-2*radius)
            velocity.y *=-1;
    }
    private PApplet o; 
    private PVector position;
    private PVector velocity;
    private float radius;
    private int c;
}