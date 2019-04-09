import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	
	int currentState = MENU_STATE;
	
	Font tittleFont;
	Font littleFont;
	
	public GamePanel() {
		timer = new Timer(1000/60, this);
		tittleFont = new Font("Clarendon", Font.PLAIN, 54);
		littleFont = new Font("Roboto", Font.PLAIN, 24);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		
		if(currentState == MENU_STATE){
            updateMenuState();
		}
		else if(currentState == GAME_STATE){
            updateGameState();
		}
		else if(currentState == END_STATE){
            updateEndState();
		}
	}
	
	//Methods
	void startGame() {
		timer.start();
	}
	
	@Override

	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 100, 100);
		
		if(currentState == MENU_STATE){
            drawMenuState(g);
		}
		else if(currentState == GAME_STATE){
            drawGameState(g);
		}
		else if(currentState == END_STATE){
            drawEndState(g);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("key pressed");
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_W) {
			
		}
		else if(keyCode == KeyEvent.VK_A) {
			
		}
		else if(keyCode == KeyEvent.VK_S) {
			
		}
		else if(keyCode == KeyEvent.VK_D) {
			
		}
		
		if(keyCode == KeyEvent.VK_ENTER) {
			if(currentState > END_STATE){
                currentState = MENU_STATE;
			}
			else {
				currentState++;
			}
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
	
	void updateMenuState() {
		
	}
	
	void updateGameState() {
		
	}
	
	void updateEndState() {
		
	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(tittleFont);
		g.setColor(Color.YELLOW);
		g.drawString("League Invaders", 50, 130);
		g.setFont(littleFont);
		g.drawString("Press ENTER to start", 130, 270);
		g.drawString("Press SPACE for instructions", 90, 500);
	}
	
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	}
	
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	}
}
