import processing.core.PApplet;

public class Scene_Play implements Scene {
    private PApplet p;
    private Game game;  
    /*PImage[] images = new PImage[3];*/
    private int num_1;
    private int num_2;
    private int num_3;

    public Scene_Play(PApplet p, Game game) {
        this.p = p;
        this.game = game;
        /*images[0] = p.loadImage("data/bunny.jpg");
        images[1] = p.loadImage("data/fox.png");
        images[2] = p.loadImage("data/bear.png");
        images[0].resize(100, 100);
        images[1].resize(100, 100);
        images[2].resize(100, 100);*/      
    }

    public void display() {
        p.background(0);
        p.fill(0, 255, 0);
        p.ellipse(p.width / 2, p.height / 2, 50, 50);
        drawGame();
        updateSpin();
    }

    public void drawGame() {
        p.image(game.background_image, 0, 0); 
        p.textSize(20);
        p.text("Coins: " + game.coins, p.width / 2, 30);
        drawSlotColumn(game.c1x_position, num_1);
        drawSlotColumn(game.c2x_position, num_2);
        p.image(game.run_button, p.width / 2 - game.run_button.width / 2, p.height - 150);
    }

    public void drawSlotColumn(float x, int index) {
        for (int i = 0; i < 3; i++) {
            float y = game.c1y_position + i * 110;
            p.text(num, x, y); //this displays the numbers
        }
    }

    public void startSpin() {
        game.start_time_of_spin = p.millis();
        num_1 = (int) p.random(1,4); // 3 slots with random numbers between 1 and 3
        num_2 = (int) p.random(1,4);
        num_3 = (int) p.random(1,4);
    }

    public void updateSpin() {
        int elapsedTime = p.millis() - game.start_time_of_spin;
        if (elapsedTime < game.spin_time) {
            num_1 = (num_1 % 3) + 1; // whole numbers between 1 and 3 no decimals
            num_2 = (num_2 % 3) + 1;
            num_3 = (num_3 % 3) + 1;
        } else {
            check_for_match();
        }
    }

    public void check_for_match() {
        if ((num_1 == num_2) && (num_2 == num_3)) {
            p.text("You won the jackpot!!", p.width / 2, p.height / 2);
            game.coins += 10000;
        } else {
            p.text("Unfortunately, you lost.", p.width / 2, p.height / 2);
        }
    }

    public void keyPressed() //spins when s is pressed
    {
        if (p.key == 's')
        {
            startSpin();  
        }
                
    }
}