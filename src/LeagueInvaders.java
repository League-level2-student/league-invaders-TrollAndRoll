import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	final static int width = 500;
	final static int height = 800;
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
		frame.addKeyListener(gamepanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		
		gamepanel.startGame();
	}
}
