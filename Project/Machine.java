import processing.core.*;


public class Machine
{
    int[][] slots = new int[2][2]; 
    public Machine(PApplet p)
    {
        this.p = p;
    }

    public void display()
    {
        
        p.ellipse(100, 100, 10, 10);
        p.ellipse(100, 200, 10, 10);

    }
    
    public void createSlots()
    {
        slots[0][0] = 1;
        slots[0][1] = 2;
        slots[1][0] = 1;
        slots[1][1] = 2;
    }
    
    

    private PApplet p; // reference to main PApplet
   
}
