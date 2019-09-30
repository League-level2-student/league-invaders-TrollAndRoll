import java.awt.Graphics;
import java.util.ArrayList;

public class objectManager{

	Rocketship ship;
	
	ArrayList <Projectile> projectiles = new ArrayList <Projectile>();
	
	public objectManager(Rocketship rocket){
		this.ship = rocket;
	}
	
	void update() {
		ship.update();
		
		for (int i=0;i< projectiles.size();i++) {
		     projectiles.get(i).update();
		}
	}
	
	void draw(Graphics g) {
		ship.draw(g);
		
		for (int i=0;i< projectiles.size();i++) {
		     projectiles.get(i).draw(g);
		}
	}
	
	void addProjectile(Projectile p){
		projectiles.add(p);
	}
}
