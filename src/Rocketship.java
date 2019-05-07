import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{

	int speed;//this one
	
	public Rocketship(int x, int y, int widht, int height)	
	{
		super(x, y, widht, height);
		
		speed = 5;
		
	}
	
	void update() {//this one & also make new ones if u need to make it move
		super.update();
	}
	
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	}
}
