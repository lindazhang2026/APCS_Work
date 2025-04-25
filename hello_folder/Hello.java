import processing.core.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Hello extends PApplet {
    PImage background_image;
    PImage run_button;
    PImage play_button;
    PImage slotmachineImage;

    int coins = 0;
    int spins = 0;
    int matches = 0;
    boolean spinning = false;
    boolean spinFinished = false;
    int spinStartTime = 0;
    final int SPIN_DURATION = 2000;
    final int DISPLAY_DURATION = 2000;
    final int MAX_SPINS = 5;
    final int MATCHES_TO_WIN = 3;

    // ArrayLists for the slot numbers
    ArrayList<Integer> leftNumbers = new ArrayList<Integer>();
    ArrayList<Integer> centerNumbers = new ArrayList<Integer>();
    ArrayList<Integer> rightNumbers = new ArrayList<Integer>();

    float playbuttonX, playbuttonY, playbuttonWidth, playbuttonHeight;
    float buttonX, buttonY, buttonWidth, buttonHeight;

    int currentScene = 0;
    Clip bgMusic;

    boolean confetti = false;
    int confettiStartTime = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textAlign(CENTER, CENTER);
        background_image = loadImage("background.jpg");
        run_button = loadImage("start.png");
        play_button = loadImage("play_button.png");
        slotmachineImage = loadImage("slotmachine.png");

        // Resize the background image to match full screen dimensions
        background_image.resize(width, height);  // Resize the background image to fill the screen perfectly

        buttonX = width / 2 - run_button.width / 2;
        buttonY = height / 2 - run_button.height / 2 + 20;

        playbuttonX = width / 2 - play_button.width / 2;
        playbuttonY = height - 180;
        playbuttonWidth = play_button.width;
        playbuttonHeight = play_button.height;

        // Resize slot machine to be larger (scaled by 2)
        float scaleFactor = 2.0f; // Increase the scale factor for larger slot machine
        slotmachineImage.resize((int) (slotmachineImage.width * scaleFactor), 
                                (int) (slotmachineImage.height * scaleFactor));

        resetGame();
        playBackgroundMusic("music.wav");
    }

    public void draw() {
        background(0);

        switch (currentScene) {
            case 0:
                drawStartScene();
                break;
            case 1:
                drawPlayScene();
                break;
            case 2:
                drawEndScene(true);
                break;
            case 3:
                drawEndScene(false);
                break;
        }

        if (confetti) {
            if (millis() - confettiStartTime < 5000) {
                drawConfetti();
            } else {
                confetti = false;
            }
        }
    }

    void drawStartScene() {
        image(background_image, 0, 0);

    // Title - Lower it just a bit
        textSize(100);
        textAlign(CENTER, CENTER);
        fill(0);
        text("Welcome to Coin Collector", width / 2 + 4, height / 5 + 24); // slightly lower shadow
        fill(255, 215, 0);
        text("Welcome to Coin Collector", width / 2, height / 5 +   20);     // slightly lower main

    // Move run button upward a bit
        image(run_button, buttonX, buttonY);

    // Text beneath the button
        fill(255);
        textSize(24);
    
    // White background for the "Click START to begin!" text
        float textWidth = textWidth("Click START to begin!") + 40; // Padding for text
        float textHeight = 40; // Height of the box
        rect(width / 2 - textWidth / 2, buttonY + run_button.height + 20, textWidth, textHeight, 10); // Draw the box with padding and rounded corners
        fill(204, 0, 0); // Red color for the text
        text("Click START to begin!", width / 2, buttonY + run_button.height + 40); // Draw the text on top of the box

    // Rules/Instructions (with padding)
        String rulesText = "How to play: You have 5 tries on the Slot Machine to get 3 rounds of matching images\n" +
                       "For each set of 3 matching images, you earn 10,000 coins\n" +
                       "Reach 30,000 coins to win the game. Good Luck!";
    
        fill(204, 153, 0); // Gold color for the rules text
        textSize(20);
        textAlign(CENTER);

        // Calculate the box size for the rules text with padding
        float rulesWidth = textWidth(rulesText) + 40;  //   Adding padding to the box
        float rulesHeight = 120; // Height of the box to fit the text comfortably

    // Draw a rectangular box for the rules text with padding   and rounded corners
        fill(255); // White background for the box
        rect(width / 2 - rulesWidth / 2, height - 140, rulesWidth, rulesHeight, 10); // Draw the box with rounded corners

        // Draw the rules text on top of the box
        fill(255, 215, 0); // Gold color for the text
        text(rulesText, width / 2, height - 100); // Draw the text  inside the box
    }

    void drawPlayScene() {
        image(background_image, 0, 0);  // Background image fills the screen perfectly
        image(play_button, playbuttonX, playbuttonY);  // Play button

        // Draw the slot machine image always
        image(slotmachineImage, width / 2 - slotmachineImage.width  / 2, height / 2 - slotmachineImage.height / 2);

        fill(255);
        textSize(32);
        
    // Move the "Coins" text down a little
        text("Coins: " + coins, width / 2, 80); // Adjusted vertical position from 60 to 80

        // Move the "Spin" text down a little
        text("Spin: " + (spins + 1) + "/" + MAX_SPINS, width / 2,   120); // Adjusted vertical position from 100 to 120

        if (spinning) {
            updateSpin();
        
        // White background for the "Slots are rotating..." text
            float textWidth = textWidth("Slots are rotating...") + 20; // Padding for text
            float textHeight = 30; // Height of the box
            fill(255); // White background for the text
            rect(width / 2 - textWidth / 2, playbuttonY - 40,   textWidth, textHeight, 10); // Draw the box with rounded corners
        
            fill(255, 215, 0);  // Gold color for text
            textSize(24);
            text("Slots are rotating...", width / 2, playbuttonY - 20); // Draw the text on top of the box
        }

        if (spinFinished) {
        drawNumbersOnSlotMachine();
        }
    }


    void drawNumbersOnSlotMachine() {
        // Draw the numbers in the center of each box
        fill(255, 215, 0);
        textSize(150); // Increase size of numbers
        textAlign(CENTER, CENTER);

        // Shift numbers slightly to the left by the same amount
        text(leftNumbers.get(leftNumbers.size() - 1), width / 2 - 230, height / 2 + 10);
        text(centerNumbers.get(centerNumbers.size() - 1), width / 2, height / 2 + 10);
        text(rightNumbers.get(rightNumbers.size() - 1), width / 2 + 170, height / 2 + 10); // <- this line fixes vertical alignment
    }

    void drawConfetti() {
        for (int i = 0; i < 100; i++) {
            float x = random(width);
            float y = random(height);
            fill(random(255), random(255), random(255));
            noStroke();
            ellipse(x, y, 8, 8);
        }
    }

    void drawEndScene(boolean win) {
        background(0);
        fill(win ? color(0, 255, 0) : color(255, 0, 0));
        textSize(42);
        textAlign(CENTER, CENTER);

        text(win ? "Congratulations, you have won this game!" : "You lose, try again!", width / 2, height / 3);

        fill(255);
        textSize(28);
        text("You collected a total of " + coins + " coins", width / 2, height / 2);

        textSize(20);
        text("Press ENTER to return to home page", width / 2, height / 2 + 60);
    }

    void updateSpin() {
        int elapsed = millis() - spinStartTime;
        if (elapsed < SPIN_DURATION) {
            leftNumbers.add((int) random(1, 4));
            centerNumbers.add((int) random(1, 4));
            rightNumbers.add((int) random(1, 4));
        } else if (elapsed < SPIN_DURATION + DISPLAY_DURATION) {
            spinFinished = true;
        } else {
            spinning = false;
            spinFinished = false;

            // Check for matches
            if (leftNumbers.get(leftNumbers.size() - 1) == centerNumbers.get(centerNumbers.size() - 1) && 
                leftNumbers.get(leftNumbers.size() - 1) == rightNumbers.get(rightNumbers.size() - 1)) {
                coins += 10000;
                matches++;
                confetti = true;
                confettiStartTime = millis();
            }

            spins++;

            if (matches >= MATCHES_TO_WIN) {
                currentScene = 2;
            } else if (spins >= MAX_SPINS) {
                currentScene = 3;
            }
        }
    }

    void startSpin() {
        spinning = true;
        spinStartTime = millis();
        spinFinished = false;
        confetti = false;
        leftNumbers.clear();
        centerNumbers.clear();
        rightNumbers.clear();
    }

    void resetGame() {
        coins = 0;
        spins = 0;
        matches = 0;
        spinning = false;
        spinFinished = false;
        confetti = false;
    }

    public void mousePressed() {
        if (currentScene == 0) {
            if (mouseX > buttonX && mouseX < buttonX + run_button.width &&
                mouseY > buttonY && mouseY < buttonY + run_button.height) {
                currentScene = 1;
                resetGame();
            }
        } else if (currentScene == 1) {
            if (!spinning && !spinFinished &&
                mouseX > playbuttonX && mouseX < playbuttonX + play_button.width &&
                mouseY > playbuttonY && mouseY < playbuttonY + play_button.height) {
                startSpin();
            }
        }
    }

    public void keyPressed() {
        if ((currentScene == 2 || currentScene == 3) && keyCode == ENTER) {
            currentScene = 0;
            resetGame();
        }
    }

    void playBackgroundMusic(String filepath) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filepath));
            bgMusic = AudioSystem.getClip();
            bgMusic.open(audioInputStream);
            bgMusic.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PApplet.main("Hello");
    }
}
