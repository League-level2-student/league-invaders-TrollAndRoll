import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	GameObject gameObject;
	
	public GamePanel() {
		timer = new Timer(1000/60, this);
		gameObject = new GameObject(0, 0, 0, 0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		gameObject.update();
		repaint();
	}
	
	//Methods
	void startGame() {
		timer.start();
	}
	
	@Override

	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 100, 100);
		gameObject.draw(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("key pressed");
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_W) {
			gameObject.y = gameObject.y - 10;
		}
		else if(keyCode == KeyEvent.VK_A) {
			gameObject.x = gameObject.x - 10;
		}
		else if(keyCode == KeyEvent.VK_S) {
			gameObject.y = gameObject.y + 10;
		}
		else if(keyCode == KeyEvent.VK_D) {
			gameObject.x = gameObject.x + 10;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("key released");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("key typed");
	}
}
