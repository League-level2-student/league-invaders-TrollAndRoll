import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{

		public Alien(int x, int y, int widht, int height) {
			super(x, y, widht, height);
		}
		
		void update() {
		y = y++;
		}
		
		void draw(Graphics g) {
			g.setColor(Color.YELLOW);
	        g.fillRect(x, y, width, height);
		}
}
