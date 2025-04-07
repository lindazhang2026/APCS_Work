import processing.core.PApplet;
import processing.core.PImage;

public class Scene_Start implements Scene {
    private PApplet p;
    private Game game; 
    PImage run_button;
    PImage background_image;
    private float buttonX, buttonY, buttonWidth, buttonHeight;

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
        
        buttonX = p.width / 2 - run_button.width / 2; 
        buttonY = p.height / 2 + 50; 
        buttonWidth = run_button.width;
        buttonHeight = run_button.height;
    }

    public void display() {
        p.background(0);
        p.image(background_image, 0, 0); 
        p.image(run_button, buttonX, buttonY); 
        
        // Display text
        p.textSize(32);
        p.textAlign(PApplet.CENTER, PApplet.CENTER);  
        p.text("Welcome to Coin Collector", p.width / 2, p.height / 4);
        p.textSize(24);
        p.text("Click the button to Start", p.width / 2, p.height / 2);
    }
   public void mousePressed() {
    if (p.mouseX > buttonX && p.mouseX < buttonX + buttonWidth && 
        p.mouseY > buttonY && p.mouseY < buttonY + buttonHeight) {
        
        // If inside the button, change to the play scene
        game.setCurrent(1);  // Move to the play scene
        System.out.println("Game Starting...");
    }
}

    public void keyPressed() {
    }
}