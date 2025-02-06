import processing.core.*;

public class Scene_End implements Scene {
    private PApplet p;
    private Game game; // Add Game object to access gameState and current

    public Scene_End(PApplet p, Game game) {
        this.p = p;
        this.game = game; // Store the reference to the Game object
    }

    public void display() {
        p.background(0);
        p.fill(255, 0, 0); // Red color for "Game Over" text
        p.textSize(32);
        p.textAlign(PApplet.CENTER, PApplet.CENTER);
        p.text("Game Over", p.width / 2, p.height / 3);
        
        p.fill(0, 255, 0); // Green color for instructions
        p.textSize(20);
        p.text("Press ENTER to return to the Menu", p.width / 2, p.height / 2);
    }

    public void keyPressed() {
        if (game.gameState == game.GAMEOVER) { // Check if the game is over
            if (p.keyCode == PApplet.ENTER) { // If ENTER is pressed
                game.gameState = game.MENU; // Set gameState to MENU
                game.setCurrent(0);; // Go back to the start scene
                System.out.println("Game over. Returning to menu...");
            }
        }
    }
}