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
			if(y != 0 || y > 0)
			{
				y -= speed;	
			}
		}
		else if(moveLeft == true) {
			if(x != 0 || x > 0)
			{
			x -= speed;
			}
		}
		else if(moveDown == true) {
			if(y != LeagueInvaders.height - this.height)
			{
			y += speed;
			}
		}
		else if(moveRight == true) {
			if(x < LeagueInvaders.width - this.width)
			{
			x += speed;
			}
		}
	}
	
	void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
	}
}
