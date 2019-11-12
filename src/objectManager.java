import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class objectManager {

	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	int score = 0;

	Rocketship ship;

	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> alien = new ArrayList<Alien>();

	public objectManager(Rocketship rocket) {
		this.ship = rocket;
	}

	int getScore() {
		return this.score;
	}
	
	void purgeObjects() {
		for (int i = 0; i < alien.size(); i++) {
			if (alien.get(i).isAlive == false) {

				alien.remove(i);
			}
		}
		for (int i = 0; i < projectiles.size(); i++) {
			if (projectiles.get(i).isAlive == false) {

				projectiles.remove(i);
			}
		}
	}

	void update() {
		ship.update();

		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
		}
		for (int i = 0; i < alien.size(); i++) {
			alien.get(i).update();
		}
		checkCollision();
		purgeObjects();
	}

	void draw(Graphics g) {
		ship.draw(g);

		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);
		}
		for (int i = 0; i < alien.size(); i++) {
			alien.get(i).draw(g);
		}
	}

	void addProjectile(Projectile p) {
		projectiles.add(p);
	}

	void addAlien(Alien a) {
		alien.add(a);
	}

	void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.width - ship.width), 0, 50, 50));
			enemyTimer = System.currentTimeMillis();
		}
	}

	void checkCollision() {
		for (Alien a : alien) {
			if (ship.collisionBox.intersects(a.collisionBox)) {
				ship.isAlive = false;
			}

				for (int l = 0; l < projectiles.size(); l++) {
					if (projectiles.get(l).collisionBox.intersects(a.collisionBox)) {
						a.isAlive = false;
						projectiles.get(l).isAlive = false;
						score = getScore() + 1;
					}
				}
			}
		}
	}

