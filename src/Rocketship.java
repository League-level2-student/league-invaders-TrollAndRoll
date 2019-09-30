import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Rocketship extends GameObject{

	int speed;
	
	boolean moveRight = false;
	boolean moveLeft = false;
	boolean moveUp = false;
	boolean moveDown = false;
	
	public Rocketship(int x, int y, int widht, int height)	
	{
		super(x, y, widht, height);
		
		speed = 5;
		
	}
	
	void update() {
		super.update();
		
		if(moveUp == true) {
			y -= speed;
		}
		else if(moveLeft == true) {
			x -= speed;
		}
		else if(moveDown == true) {
			y += speed;
		}
		else if(moveRight == true) {
			x += speed;
		}
	}
	
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	}
}
