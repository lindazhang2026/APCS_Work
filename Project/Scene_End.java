import processing.core.PApplet;

public class Scene_End implements Scene {
    private PApplet p;
    private Game game; // Access to Game object to manage scene transitions

    public Scene_End(PApplet p, Game game) {
        this.p = p;
        this.game = game; // Store reference to Game object
    }

    public void display() {
        p.background(0);  // Set background to black
        p.fill(255, 0, 0); // Red color for "Game Over" text
        p.textSize(32);
        p.textAlign(PApplet.CENTER, PApplet.CENTER);
        p.text("Game Over", p.width / 2, p.height / 3); // Game over message
        
        p.fill(0, 255, 0); // Green color for instructions
        p.textSize(20);
        p.text("Press ENTER to return to the Menu", p.width / 2, p.height / 2);
    }

    public void keyPressed() {
        // Check if the current scene is Scene_End
        if (game.getCurrent() == 2) { // Scene_End is at index 2 in scenes list
            if (p.keyCode == 10) { // If ENTER (keyCode 10) is pressed
                game.setCurrent(0);  // Switch to the start scene (Scene_Start)
                System.out.println("Game over. Returning to menu...");
            }
        }
    }
}
