import processing.core.*;
import java.util.*;

public class Game extends PApplet {
    final int MENU = 0;
    final int GAMESTART = 1;
    final int GAMEOVER = 2;
    int coins = 0;
    int c1_index = 0; //column 1
    int c2_index = 0; //column 2; 2 columns 3 images each

    float c1x_position = 150;
    float c2x_position = 350;
    float c1y_position = 100;
    float c2y_position = 100;

    int spin_time = 2000; // 2000 ms = 2 s
    int start_time_of_spin = 0;
    
    private int gameState;
    private ArrayList<Scene> scenes;
    private int current;

    public void settings() {
        size(1000, 1000);
    }

    public void setup() {
        noStroke();
        fill(255);

        scenes = new ArrayList<Scene>();
        scenes.add(new Scene_Start(this, this)); //start scene
        scenes.add(new Scene_Play(this, this)); //play scene
        scenes.add(new Scene_End(this)); //end scene
        
        gameState = MENU; // start in MENU state
        current = 0;
    }

    public void draw() {
        background(0);
        scenes.get(current).display();
    }

    public void keyPressed() {
        scenes.get(current).keyPressed();
        
        if (gameState == MENU && key == ENTER)
        {
            gameState = GAMESTART;
            current =1;
            System.out.println("Game Starting...");
        }
        else if (gameState == GAMEOVER && key == ENTER)
        {
            gameState = MENU;
            current =0;
            System.out.println("Game over. Going back to menu...");
        }
    }
    
    public static void main(String[] args) {
        PApplet.main("Game");
    }
    
    public void startSpin()
    {
        System.out.println("Spin started!");  
    }
}