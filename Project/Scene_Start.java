import processing.core.PApplet;

public class Scene_Start implements Scene {
    private PApplet p;
    private Game game; // object game inside Game class
    PImage run_button;
    PImage background_image;

    public Scene_Start(PApplet p, Game game) {
        this.p = p;
        this.game = game;  
        background_image = p.loadImage("background.jpg");
        if (background_image == null) {
            System.out.println("Error loading background image.");
        } else {
            background_image.resize(background_image.width / 2, background_image.height / 2);
        }
        
        run_button = p.loadImage("start.png");
        if (run_button == null) {
            System.out.println("Error loading start button image.");
        } else {
            run_button.resize(run_button.width / 2, run_button.height / 2);
        }
    }

    public void display() {
        p.background(0);
        p.image(background_image, 0, 0); // background img
        p.image(run_button, p.width / 2 - run_button.width / 2, p.height / 2 + 50); // button
        p.textSize(32);
        p.textAlign(PApplet.CENTER, PApplet.CENTER);  
        p.text("Welcome to Coin Collector", p.width / 2, p.height / 4);
        p.textSize(24);
        p.text("Press Enter to Learn the Rules", p.width / 2, p.height / 2);
    }

    public void keyPressed() {
        if (game.gameState == game.MENU) {
            if (p.keyCode == PApplet.ENTER) {  
                game.gameState = game.GAMESTART;
                System.out.println("Game starting...");
            }
        else if (game.gameState == game.GAMEOVER) {
            if (p.keyCode == PApplet.ENTER) {
                game.gameState = game.MENU;
                game.current = 0;
                System.out.println("Game over. Returning to menu...");
            }
        }
    }
} 

