import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	final int width = 500;
	final int height = 800;
	GamePanel gamepanel;
	JFrame frame;
	
	public static void main(String[] args) {
		LeagueInvaders game = new LeagueInvaders();
		game.setup();
	}
	
	public LeagueInvaders() {
		frame = new JFrame();
		gamepanel = new GamePanel();
	}
	
	void setup() {
		frame.add(gamepanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		
		gamepanel.startGame();
	}
}
