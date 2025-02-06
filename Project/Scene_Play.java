import processing.core.*;

public class Scene_Play implements Scene {
    private PApplet p;

    public Scene_Play(PApplet p) {
        this.p = p;
    }

    public void display() {
        p.background(0);
        p.fill(0, 255, 0);
        p.ellipse(p.width / 2, p.height / 2, 50, 50);

        // Call the game logic methods here:
        drawGame();
    }

    public void drawGame() {
        p.image(background_image, 0, 0);
        p.textSize(20);
        p.text("Coins: " + coins, p.width / 2, 30);

        drawSlotColumn(c1x_position, c1_index);
        drawSlotColumn(c2x_position, c2_index);

        p.image(run_button, p.width / 2 - run_button.width / 2, p.height - 150);
    }

    public void drawSlotColumn(float x, int index) {
        for (int i = 0; i < 3; i++) {
            float y = image_1Y + i * 110;
            p.image(images[(index + i) % images.length], x, y);
        }
    }

    public void startSpin() {
        start_time_of_spin = p.millis();
        c1_index = (int) p.random(0, images.length);
        c2_index = (int) p.random(0, images.length);
    }

    public void updateSpin() {
        int elapsedTime = p.millis() - start_time_of_spin;
        if (elapsedTime < spin_time) {
            c1_index = (c1_index + 1) % images.length;
            c2_index = (c2_index + 1) % images.length;
        } else {
            check_for_match();
        }
    }

    public void check_for_match() 
    {
        if (c1_index == c2_index)
        {
            p.text("You won the jackpot!!", p.width / 2, p.height / 2);
            coins += 10000;  
        }
        else
        {
            p.text("Unfortunately, you lost.", p.width / 2, p.height / 2);   
        }
    }
}