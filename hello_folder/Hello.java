import processing.core.*;

public class Hello extends PApplet {
    PImage background_image;
    PImage run_button;
    PImage play_button;

    int coins = 0;
    boolean spinning = false;
    int spinStartTime = 0;
    final int SPIN_DURATION = 2000;
    
    int[][] slots = new int[2][2]; // 2 columns, 2 rows
    int[][] spinSlots = new int[2][2]; // Temporarily holds the numbers while spinning
    float[] columnX = {150, 350}; // X positions for columns
    float columnY = 100;

    // Rotation angle for each column
    float[] rotationAngle = {0, 0};
    float rotationSpeed = 0.05f; // Speed of rotation during spin

    float buttonX, buttonY, buttonWidth, buttonHeight;
    float playbuttonX, playbuttonY, playbuttonWidth, playbuttonHeight;
    
    // Current scene: 0 = Start Scene, 1 = Play Scene, 2 = Game Over Scene
    int currentScene = 0;
    
    // Whether to show the result screen
    boolean gameOver = false;

    public void settings() {
        size(1000, 1000);
    }

    public void setup() {
        noStroke();
        fill(255);
        textAlign(CENTER, CENTER);
        
        // Load images
        background_image = loadImage("background.jpg");
        run_button = loadImage("start.png");
        play_button = loadImage("play_button.png");
        
        // Resize background to fit the screen
        background_image.resize(width, height);
        
        // Initialize button positions
        buttonX = width / 2 - run_button.width / 2;
        buttonY = height / 2 + 50;
        buttonWidth = run_button.width;
        buttonHeight = run_button.height;
        
        playbuttonX = width / 2 - play_button.width / 2;
        playbuttonY = height - 150;
        playbuttonWidth = play_button.width;
        playbuttonHeight = play_button.height;
        
        // Initialize slots
        resetSlots();
    }

    public void draw() {
        background(0);
        
        switch(currentScene) {
            case 0: // Start Scene
                drawStartScene();
                break;
            case 1: // Play Scene
                drawPlayScene();
                break;
            case 2: // Game Over Scene
                drawEndScene();
                break;
        }
    }
    
    void drawStartScene() {
        image(background_image, 0, 0);
        image(run_button, buttonX, buttonY);
        
        textSize(32);
        text("Welcome to Coin Collector", width / 2, height / 4);
        textSize(24);
        text("Click the button to Start", width / 2, height / 2);
    }
    
    void drawPlayScene() {
        image(background_image, 0, 0);
        image(play_button, playbuttonX, playbuttonY);
        
        text("Coins: " + coins, width / 2, 30);
        
        // Draw rotating slots (2 columns)
        for (int i = 0; i < 2; i++) { // Iterate through columns
            float x = columnX[i];
            float y = columnY;
            drawRotatingColumn(x, y, i);
        }
        
        // Handle spinning animation
        if (spinning) {
            updateSpin();
        }
    }
    
    void drawEndScene() {
        background(0);
        fill(255, 0, 0);
        textSize(32);
        text("Game Over", width / 2, height / 3);
        
        fill(0, 255, 0);
        textSize(20);
        text("Press ENTER to Return to Start", width / 2, height / 2);
    }
    
    void drawRotatingColumn(float x, float y, int columnIndex) {
        pushMatrix();
        translate(x, y); // Move origin to the center of the column
        rotate(rotationAngle[columnIndex]); // Rotate the column
        
        // Front and back visibility effect
        int frontRow = (int)(frameCount * rotationSpeed) % 2; // Toggle front and back
        int backRow = 1 - frontRow; // Alternate between the two rows

        // Draw front row (visible side of the column)
        textSize(48);
        text(spinSlots[columnIndex][frontRow], -30, -50); // Top number of the front row
        text(spinSlots[columnIndex][backRow], -30, 50);  // Bottom number of the back row
        
        popMatrix();
    }

    void updateSpin() {
        int elapsed = millis() - spinStartTime;
        if (elapsed < SPIN_DURATION) {
            // Animate spinning by changing the numbers for each column
            for (int i = 0; i < 2; i++) { // Iterate over columns
                spinSlots[i][0] = (int)random(1, 3); // Update top number in the column
                spinSlots[i][1] = (int)random(1, 3); // Update bottom number in the column
            }
            // Increase rotation angle to simulate spinning
            for (int i = 0; i < 2; i++) {
                rotationAngle[i] += rotationSpeed;
            }
        } else {
            spinning = false;
            checkWin();
        }
    }
    
    void checkWin() {
        // Check if the numbers in both columns match (both rows must match)
        boolean win = true;
        for (int i = 0; i < 2; i++) {
            if (spinSlots[i][0] != spinSlots[i][1]) { // Check if both rows in the column differ
                win = false;
                break;
            }
        }
        
        if (win) {
            coins += 10000; // Player wins
        }
        gameOver = true; // Transition to game over scene
        currentScene = 2; // Game over scene
    }
    
    void resetSlots() {
        // Initialize the 2 columns each with 2 random numbers (1 or 2)
        for (int i = 0; i < 2; i++) { // Iterate over columns
            for (int j = 0; j < 2; j++) { // Iterate over rows per column
                slots[i][j] = (int)random(1, 3); // Randomize numbers between 1 and 2
            }
        }
    }
    
    void startSpin() {
        spinning = true;
        spinStartTime = millis();
    }

    public void mousePressed() {
        if (currentScene == 0) { // Start scene
            // Check if clicked on the start button
            if (mouseX > buttonX && mouseX < buttonX + buttonWidth && 
                mouseY > buttonY && mouseY < buttonY + buttonHeight) {
                currentScene = 1; // Go to play scene
                resetSlots();
            }
        } else if (currentScene == 1) { // Play scene
            // Check if clicked on the spin button
            if (mouseX > playbuttonX && mouseX < playbuttonX + playbuttonWidth && 
                mouseY > playbuttonY && mouseY < playbuttonY + playbuttonHeight) {
                startSpin();
            }
        }
    }
    
    public void keyPressed() {
        if (currentScene == 2 && keyCode == ENTER) { // Game over scene
            currentScene = 0; // Return to start
            gameOver = false;
            resetSlots();
        }
    }

    public static void main(String[] args) {
        PApplet.main("Hello");
    }
}