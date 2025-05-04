import processing.core.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Hello extends PApplet {
    PImage background_image, run_button, play_button, slotmachineImage;
    PImage rubyIcon, cherryIcon, coinIcon;

    int coins = 0, spins = 0, matches = 0;
    boolean confetti = false;
    int confettiStartTime = 0;

    final int MAX_SPINS = 5;
    final int MATCHES_TO_WIN = 3;

    ArrayList<Integer> leftNumbers = new ArrayList<>();
    ArrayList<Integer> centerNumbers = new ArrayList<>();
    ArrayList<Integer> rightNumbers = new ArrayList<>();

    float playbuttonX, playbuttonY, buttonX, buttonY;
    int currentScene = 0;

    PImage getIcon(int value) {
        switch (value) {
            case 1: return rubyIcon;
            case 2: return cherryIcon;
            case 3: return coinIcon;
            default: return null;
        }
    }

    void drawConfetti() {
        for (int i = 0; i < 100; i++) {
            float x = random(width), y = random(height);
            fill(random(255), random(255), random(255));
            noStroke(); ellipse(x, y, 8, 8);
        }
    }

    void drawEndScene(boolean win) {
        background(0);
        fill(win ? color(0, 255, 0) : color(255, 0, 0));
        textSize(42);
        text(win ? "Congratulations, you have won the Grand Prize!" : "Unfortunately, you lost. Try again?", width / 2, height / 3);
        fill(255); textSize(28);
        text("You collected a total of " + coins + " coins", width / 2, height / 2);
        textSize(20);
        text("Press ENTER to return to home page", width / 2, height / 2 + 60);
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textAlign(CENTER, CENTER);
        background_image = loadImage("background.jpg");
        run_button = loadImage("start.png");
        play_button = loadImage("play_button.png");
        slotmachineImage = loadImage("slotmachine.png");

        rubyIcon = loadImage("rubyicon.png");
        cherryIcon = loadImage("cherryicon.png");
        coinIcon = loadImage("coinicon.png");

        background_image.resize(width, height);
        slotmachineImage.resize((int) (slotmachineImage.width * 2.0), (int) (slotmachineImage.height * 2.0));

        buttonX = width / 2 - run_button.width / 2;
        buttonY = height / 2 - run_button.height / 2 + 20;

        playbuttonX = width / 2 - play_button.width / 2;
        playbuttonY = height - 180;

        resetGame();
    }

    public void draw() {
        background(0);
        switch (currentScene) {
            case 0: drawStartScene(); break;
            case 1: drawPlayScene(); break;
            case 2: drawEndScene(true); break;
            case 3: drawEndScene(false); break;
        }

        if (confetti && millis() - confettiStartTime < 5000) {
            drawConfetti();
        }
    }

    void drawStartScene() {
        image(background_image, 0, 0);
        fill(0); textSize(100);
        text("Welcome to Coin Collector", width / 2 + 4, height / 5 + 24);
        fill(255, 215, 0);
        text("Welcome to Coin Collector", width / 2, height / 5 + 20);

        image(run_button, buttonX, buttonY);
        fill(255); textSize(24);
        rect(width / 2 - 160, buttonY + run_button.height + 20, 320, 40, 10);
        fill(204, 0, 0);
        text("Click START to begin!", width / 2, buttonY + run_button.height + 40);

        String rulesText = "How to play: You have 5 tries on the Slot Machine to get 3 rounds of matching images\n" +
                           "For each set of 3 matching images, you earn 10,000 coins\n" +
                           "Reach 30,000 coins to win the game. Good Luck!";
        fill(255); rect(width / 2 - 400, height - 140, 800, 120, 10);
        fill(0); textSize(20); text(rulesText, width / 2, height - 100);
    }

    void drawPlayScene() {
        image(background_image, 0, 0);
        image(play_button, playbuttonX, playbuttonY);
        image(slotmachineImage, width / 2 - slotmachineImage.width / 2, height / 2 - slotmachineImage.height / 2);

        fill(255);
        textSize(32);
        text("Coins: " + coins, width / 2, 80);
        text("Spin: " + (spins + 1) + "/" + MAX_SPINS, width / 2, 120);

        drawFinalIcons();
    }

    void drawFinalIcons() {
        int imgSize = 130;

        if (!leftNumbers.isEmpty()) {
            PImage left = getIcon(leftNumbers.get(leftNumbers.size() - 1));
            PImage center = getIcon(centerNumbers.get(centerNumbers.size() - 1));
            PImage right = getIcon(rightNumbers.get(rightNumbers.size() - 1));

            image(left, width / 2 - 230 - imgSize / 2, height / 2 - imgSize / 2, imgSize, imgSize);
            image(center, width / 2 - imgSize / 2, height / 2 - imgSize / 2, imgSize, imgSize);
            image(right, width / 2 + 170 - imgSize / 2, height / 2 - imgSize / 2, imgSize, imgSize);
        }
    }

    void startSpin() {
        int left = (int) random(1, 4);
        int center = (int) random(1, 4);
        int right = (int) random(1, 4);

        leftNumbers.clear();
        centerNumbers.clear();
        rightNumbers.clear();

        leftNumbers.add(left);
        centerNumbers.add(center);
        rightNumbers.add(right);

        if (left == center && center == right) {
            coins += 10000;
            matches++;
            confetti = true;
            confettiStartTime = millis();
        }

        spins++;

        if (matches >= MATCHES_TO_WIN) {
            delay(1500);
            currentScene = 2;
        } else if (spins >= MAX_SPINS) {
            delay(1500);
            currentScene = 3;
        }
    }

    void resetGame() {
        coins = 0;
        spins = 0;
        matches = 0;
        confetti = false;
        leftNumbers.clear();
        centerNumbers.clear();
        rightNumbers.clear();
    }

    public void mousePressed() {
        if (currentScene == 0 &&
            mouseX > buttonX && mouseX < buttonX + run_button.width &&
            mouseY > buttonY && mouseY < buttonY + run_button.height) {
            currentScene = 1;
            resetGame();
        } else if (currentScene == 1 &&
                   mouseX > playbuttonX && mouseX < playbuttonX + play_button.width &&
                   mouseY > playbuttonY && mouseY < playbuttonY + play_button.height) {
            startSpin();
        }
    }

    public void keyPressed() {
        if ((currentScene == 2 || currentScene == 3) && keyCode == ENTER) {
            currentScene = 0;
            resetGame();
        }
    }

    public static void main(String[] args) {
        PApplet.main("Hello");
    }
}
