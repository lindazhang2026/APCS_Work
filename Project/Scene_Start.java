import processing.core.PApplet;

public class Scene_Start implements Scene {
    private PApplet p;
    private Game game;  

    public Scene_Start(PApplet p, Game game) {
        this.p = p;
        this.game = game;  
    }

    public void display() {
        p.background(0);
        p.textSize(32);
        p.textAlign(PApplet.CENTER, PApplet.CENTER);  
        p.text("Welcome to Coin Collector", p.width / 2, p.height / 4);
        p.textSize(24);
        p.text("Press Enter to Learn the Rules", p.width / 2, p.height / 2);
    }

    public void keyPressed() {
        if (game.gameState.equals("welcome")) {
            if (p.keyCode == PApplet.ENTER) {  
                game.gameState = "how to play";
                System.out.println("Game state: " + game.gameState);
            }
        } else if (game.gameState.equals("how to play")) {
            if (p.key == 'a' || p.key == 'A') {
                game.gameState = "welcome";
                System.out.println("Game state: " + game.gameState);
            }
        } else if (p.keyCode == PApplet.ENTER) {
            game.gameState = "game";
            System.out.println("Game state: " + game.gameState);
        } else if (game.gameState.equals("game")) {
            if (p.key == 'b' || p.key == 'B') {
                game.startSpin(); 
            }
        }
    }
}