import processing.core.PApplet;

public class Scene_Play implements Scene {
    private PApplet p;
    private Game game;  
    PImage[] images = new PImage[3];
    images[0] = loadImage("bunny.jpg"); 
    images[1] = loadImage("fox.png");
    images[2] = loadImage("bear.png");
    images[0].resize(100, 100);
    images[1].resize(100, 100);
    images[2].resize(100, 100);

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
        p.image(game.background_image, 0, 0); 
        p.textSize(20);
        p.text("Coins: " + game.coins, p.width / 2, 30);
        drawSlotColumn(game.c1x_position, game.c1_index);
        drawSlotColumn(game.c2x_position, game.c2_index);
        p.image(game.run_button, p.width / 2 - game.run_button.width / 2, p.height - 150);
    }

    public void drawSlotColumn(float x, int index) {
        for (int i = 0; i < 3; i++) {
            float y = game.c1y_position + i * 110;
            p.image(game.images[(index + i) % game.images.length], x, y);  
        }
    }

    public void startSpin() {
        game.start_time_of_spin = p.millis();
        game.c1_index = (int) p.random(0, game.images.length);
        game.c2_index = (int) p.random(0, game.images.length);
    }

    public void updateSpin() {
        int elapsedTime = p.millis() - game.start_time_of_spin;
        if (elapsedTime < game.spin_time) {
            game.c1_index = (game.c1_index + 1) % game.images.length;
            game.c2_index = (game.c2_index + 1) % game.images.length;
        } else {
            check_for_match();
        }
    }

    public void check_for_match() {
        if (game.images[game.c1_index].equals(game.images[(game.c1_index + 1) % 3]) && 
            game.images[game.c2_index].equals(game.images[(game.c2_index + 1) % 3])) {
            p.text("You won the jackpot!!", p.width / 2, p.height / 2);
            game.coins += 10000;
        } else {
            p.text("Unfortunately, you lost.", p.width / 2, p.height / 2);
        }
    }

    public void keyPressed() {

    }
}