import processing.core.*;
import java.util.*;

public class Game extends PApplet {
    int coins = 0;
    PImage run_button;
    PImage background_image;
    PImage[] images = new PImage[3];
    int c1_index = 0; //column 1
    int c2_index = 0; //column 2; 2 columns 3 images each

    float c1x_position = 150;
    float c2x_position = 350;
    float c1y_position = 100;
    float c2y_position = 100;

    int spin_time = 2000; // 2000 ms = 2 s
    int start_time_of_spin = 0;
    
    String gameState = "welcome";
    private ArrayList<Scene> scenes;
    private int current;

    public void settings() {
        size(1000, 1000);
    }

    public void setup() {
        size(600, 600);
        images[0] = loadImage("data/bunny.png"); 
        images[1] = loadImage("data/fox.webp");
        images[2] = loadImage("data/bear.png");
        images[0].resize(100, 100);
        images[1].resize(100, 100);
        images[2].resize(100, 100);

        background_image = loadImage("background.gif");
        background_image.resize(background_image.width / 2, background_image.height / 2);
        run_button = loadImage("start.png");
        run_button.resize(run_button.width / 2, run_button.height / 2);

        noStroke();
        fill(255);

        scenes = new ArrayList<Scene>();
        scenes.add(new Scene_Start(this));
        scenes.add(new Scene_Play(this));
        scenes.add(new Scene_End(this));

        current = 0;
    }

    public void draw() {
        background(0);
        scenes.get(current).display();
    }

    public void keyPressed() {
        scenes.get(current).keyPressed();
    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }
}