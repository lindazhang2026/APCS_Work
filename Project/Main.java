import processing.core.*;
import java.util.*;

String gameState  = "welcome";
int coins = 0;
PImage run_button;
PImage background_image;
PImage image_1;
PImage image_2;
float column_1;
float image_1Y;
float image_2Y;

void setup(){
    size(600,600);
    image_1 = loadImage("");
    image_1.resize(image_1.width / #, image_1.height / #);
    image_2 = loadImage("");
    image_2.resize(image_2.width / #, image_2.height / #);
    background_image = loadImage("");
    background_image.resize(background_image.width / #; background_image.height / #);
    run_button = loadImage("");
    run_button.resize(run_button.width / #, run_button.height / #);
    background(0);
    noStroke();
    fill(102);
}
void draw(){
    if (gameState)
    
}

   