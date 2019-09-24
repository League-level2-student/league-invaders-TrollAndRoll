import java.awt.Graphics;

public class objectManager {

	Rocketship ship;
	
	
	
	public objectManager(Rocketship rocket){
		this.ship = rocket;
	}
	
	void update() {
		ship.update();
	}
	
	void draw(Graphics g) {
		ship.draw(g);
	}
}
