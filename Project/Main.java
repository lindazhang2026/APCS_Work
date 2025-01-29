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

int spin_time = 2000; // 2000 ms = 2 s
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
}
void keyPressed() {
    if (gameState == "welcome") {
        if (keyCode == ENTER){
            gameState = "how to play";
        }
    } else if (gameState == "how to play") {
        if (key == 'a' || key == 'A') {
            gameState = "welcome";
        } else if (keyCode == ENTER) {
            gameState = "game";
        }
    } else if (gameState == "game") {
        if (key == 'b' || key == 'B') {
            startSpin();
        }
    }
}
public void drawStart() {
    textSize(32);
    textAlign(CENTER, CENTER);
    text("Welcome to Coin Collector", width / 2, height / 4);
    textSize(24);
    text("Press Enter to Learn the Rules", width / 2, height / 2);
}

public void drawRules() {
    textSize(32);
    textAlign(CENTER, CENTER);
    text("Rules of Coin Collector", width / 2, height / 2);
    textSize(24);
    text("Press Enter to Start the Game", width / 2, height / 2);
    text("Press 'b' to Spin the Slot Machine", width / 2, height / 2);
}
public void drawGame() {
    image(background_image, 0, 0);
    textSize(20);
    text("Coins: " + coins, width / 2, 30);
    
    drawSlotColumn(c1x_position, c1_index);
    drawSlotColumn(c2x_position, c2_index);
    
    image(run_button, width / 2 - run_button.width / 2, height - 150);
}
public void drawSlotColumn(float x, int index) {
    for (int i=0; i<3; i++)
    {
        float y = image_1Y + i * 110;
        image(images[(index + i) % images.length], x, y);
    }
}
public void startSpin() {
    start_time_of_spin = millis();
    c1_index = (int) random(0, images.length);
    c2_index = (int) random(0, images.length);
}
public void updateSpin() {
    int elapsedTime = millis() - spinStartTime;
    if (elapsedTime < spin_time)
    {
        column_1_index = (column_1_index + 1) % images.length;
        column_2_index = (column_2_index + 1) % images.length; 
    }
    else {
        check_for_match();
    }
}

public void check_for_match() {
    if (images[c1_index].equals(images[c1_index + 1 % 3]) && images[c2_index].equals(images[c2_index + 1 % 3])) {
        coins += 10000;
        text("You won the jackpot!!", width / 2, height / 2);
    } else {
        text("Unfortunately, you lost.", width / 2, height / 2);
    }
}

   