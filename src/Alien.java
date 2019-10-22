import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Alien extends GameObject {

	Random moveDecider = new Random();

	public Alien(int x, int y, int widht, int height) {
		super(x, y, widht, height);
	}

	int i = 0;
	int move = moveDecider.nextInt(2);

	void update() {

		y = y + 1;
		if (i > 30) {
			i = 0;
			move = moveDecider.nextInt(2);
		}
		i = i + 1;
		if (move == 0) {
			x = x + 1;
		} else if (move == 1) {
			x = x - 1;
		}
		
		super.update();
	}

	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
