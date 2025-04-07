import processing.core.PApplet;
public class Scene_Play implements Scene {
    private PApplet p;
    private Game game;
    private int num_1;
    private int num_2;
    private int num_3;

    public Scene_Play(PApplet p, Game game) {
        this.p = p;
        this.game = game;
    }

    public void display() {
        p.background(0);
        p.fill(0, 255, 0);
        p.ellipse(p.width / 2, p.height / 2, 50, 50);
        drawGame();
        updateSpin();
    }

    public void drawGame() {
        p.textSize(20);
        p.text("Coins: " + game.coins, p.width / 2, 30);
        drawSlotColumn(game.c1x_position, num_1);
        drawSlotColumn(game.c2x_position, num_2);
        p.image(game.background_image, 0, 0);
        p.image(game.run_button, p.width / 2 - game.run_button.width / 2, p.height - 150);
    }

    public void drawSlotColumn(float x, int index) {
        for (int i = 0; i < 3; i++) {
            float y = game.c1y_position + i * 110;
            p.text(index, x, y); // Display number for now
        }
    }

    public void startSpin() {
        game.start_time_of_spin = p.millis();
        num_1 = (int) p.random(1, 4); // 3 random numbers between 1 and 3
        num_2 = (int) p.random(1, 4);
        num_3 = (int) p.random(1, 4);
    }

    public void updateSpin() {
        int elapsedTime = p.millis() - game.start_time_of_spin;
        if (elapsedTime < game.spin_time) {
            num_1 = (num_1 % 3) + 1; // Cycle numbers between 1-3
            num_2 = (num_2 % 3) + 1; // can replace num_1 num_2 num_3 with images later
            num_3 = (num_3 % 3) + 1;
        } else {
            check_for_match();
        }
    }

    public void check_for_match() {
        if (num_1 == num_2 && num_2 == num_3) {
            p.text("You won the jackpot!!", p.width / 2, p.height / 2);
            game.coins += 10000; // Award coins for a match
        } else {
            p.text("Unfortunately, you lost.", p.width / 2, p.height / 2);
        }
    }

    public void keyPressed() {
        if (p.key == 's') {
            startSpin(); // Start the spin when 's' is pressed
        }
    }
}