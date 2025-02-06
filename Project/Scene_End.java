import processing.core.*;

public class Scene_End implements Scene {
    private PApplet p;

    public Scene_End(PApplet p) {
        this.p = p;
    }

    public void display() {
        p.background(0);
        p.fill(0, 255, 0);
        p.ellipse(p.width / 2, p.height / 2, 50, 50);
    }

    public void keyPressed()
    {
        if (game.gameState == game.GAMEOVER)
        {
            if (p.keyCode == PApplet.ENTER)
            {
                game.gameState = game.MENU;
                game.current = 0;
                System.out.println("Game over. Returning to menu...");    
            }
        }
            
    }
        
}