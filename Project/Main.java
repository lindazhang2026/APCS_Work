import processing.core.*;
import java.util.*;

String gameState  = "welcome";
int coins = 0;
PImage run_button;
PImage background_image;
PImage[] images = new PImage[3];
int c1_index == 0; //column 1
int c2_index == 0; //column 2; 2 columns 3 images each

float c1x_position = 150;
float c2x_position = 350;
float c1y_position = 100;
float c2y_position = 100;

int time_of_spin = 2000; // 2000 ms = 2 s
int start_time_of_spin = 0;

PImage image_1;
PImage image_2;
float column_1;
float image_1Y;
float image_2Y;

void setup(){
    size(600,600);
    images[0] = loadImage("");
    images[0].resize(100,100);
    images[1] = loadImage("");
    images[1].resize(100,100);
    images[2] = loadImage("");
    images[2].resize(100,100);
    
    background_image = loadImage("");
    background_image.resize(background_image.width / 2, background_image.height / 2);
    run_button = loadImage("");
    run_button.resize(run_button.width / 2, run_button.height / 2);
    
    noStroke();
    fill(255);
}
public void draw(){
    
    background(0);
    
    if (gameState == "welcome") {
        drawStart();
    } else if (gameState == "how to play") {
        drawRules();
    } else if (gameState == "game") {
        drawGame();
        
    } if (coins == 10000) {
        drawEnd();
    }  
}
void keyPressed() {
    if (gameState == "welcome") {
        if (keyCode == ENTER){
            gameState == "how to play";
        }
    } else if (gameState == "how to play") {
        if (key == 'a' || key == 'A') {
            gameState == "welcome";
        } else if (keyCode == ENTER) {
            gameState =='game';
        }
    } else if (gameState == "game") {
        drawGame();
        if (key == 'b' || key == 'B') {
            
        }
    }
}

   