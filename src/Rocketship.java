import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{

	public Rocketship(int x, int y, int widht, int height)	
	{
		super(x, y, widht, height);
		
	}
	
	void update() {
		
	}
	
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	}
}
