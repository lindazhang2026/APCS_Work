import processing.core.*;
import java.util.*;

public class Game extends PApplet {
    PImage background_image;
    PImage run_button;
    int coins = 0;
    int c1_index = 0; // Column 1
    int c2_index = 0; // Column 2

    float c1x_position = 150;
    float c2x_position = 350;
    float c1y_position = 100;
    float c2y_position = 100;

    int spin_time = 2000; // Spin time in ms (2 seconds)
    int start_time_of_spin = 0;

    private ArrayList<Scene> scenes;
    int current;

    public void settings() {
        size(1000, 1000);  // Set the window size
    }

    public void setup() {
        noStroke();  // Disable stroke for shapes
        fill(255);   // Set fill color to white
        
        background_image = loadImage("background.jpg");
        run_button = loadImage("start.png");

        // Initialize scenes
        scenes = new ArrayList<Scene>();
        scenes.add(new Scene_Start(this, this)); // Scene_Start
        scenes.add(new Scene_Play(this, this));  // Scene_Play
        scenes.add(new Scene_End(this, this));   // Scene_End
        
        current = 0;  // Start in the first scene (Scene_Start)
    }

    public void draw() {
        background(0);  // Set background to black
        scenes.get(current).display();  // Call the display method of the current scene
    }

    public void keyPressed() {
        if (current == 2) { // If we're in the end scene
            if (keyCode == ENTER) {
                setCurrent(0); // Return to the start scene (Scene_Start)
                System.out.println("Game over. Returning to menu...");
            }
        }
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getCurrent() {
        return current;
    }

    public static void main(String[] args) {
        PApplet.main("Game");  // Start the game by running the main class
    }
}