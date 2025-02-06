import processing.core.*;

public class Scene_Start implements Scene {
    private PApplet p;

    public Scene_Start(PApplet p) {
        this.p = p;
    }

    public void display() {
        p.textSize(32);
        p.textAlign(CENTER, CENTER);
        p.text("Welcome to Coin Collector", p.width / 2, p.height / 4);
        p.textSize(24);
        p.text("Press Enter to Learn the Rules", p.width / 2, p.height / 2);
    }

    public void keyPressed() {
        if (gameState.equals("welcome")) {
            if (p.keyCode == ENTER) {
                gameState = "how to play";
            }
        } else if (gameState.equals("how to play")) {
            if (p.key == 'a' || p.key == 'A') {
                gameState = "welcome";
            }
        } else if (p.keyCode == ENTER) {
            gameState = "game";
        } else if (gameState.equals("game")) {
            if (p.key == 'b' || p.key == 'B') {
                startSpin();
            }
        }
    }
}