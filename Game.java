import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;


public class Game extends Canvas implements Runnable {
	
	public static final long serialVersionUIL = 1L;
	
	public static final int HEIGHT = 200;
	public static final int WIDTH = 200;
	public static final int SCALE = 2;
	
	public static final String NAME = "Pixel Engine";
	
	private BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferdImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer().getData());
	
	Random random = new Random();
	
	
	public void run()
	{
		
	}
	public static void main(String[]srgs){
		Game game = new Game();
		game.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		game.setMaximumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		game.setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		
		JFrame frame = new JFrame(NAME);
		frame.add(game);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(true);
	}
}
