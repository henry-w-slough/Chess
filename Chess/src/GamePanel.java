import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class GamePanel extends JPanel implements Runnable {
	
	int boardTiles = 8;
	int screenSize = 640;
	//int tileSize = screenSize / boardTiles;
	

	Graphics2D graphics;


	Thread gameThread;


	BufferedImage boardImage = loadImage("/sprites/board_sprite.png");

	public ArrayList<Piece> allPieces = new ArrayList<Piece>();
	
	
	
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenSize, screenSize));
		this.setDoubleBuffered(true);
		
		
		gameThread = new Thread(this);
		gameThread.start();	
	}
	
	
	

	public void run() {
		repaint();
	}
	
	
	
	
	//overriding built in paintComponent() function for custom screen actions
	public void paintComponent(Graphics g) {
		graphics = (Graphics2D)g;

		graphics.drawImage(boardImage, 0, 0, null);
		
		for (int s=0;s<allPieces.size();s++) {
			graphics.drawImage(allPieces.get(s).img, allPieces.get(s).pos[0], allPieces.get(s).pos[1], null);
		}

	}
		
	
	
	
	public BufferedImage loadImage(String path) {
	    try {
	        // Load image from resources folder
	        return ImageIO.read(getClass().getResource(path));
	    } catch (IOException e) {
	        e.printStackTrace();
	        return null;  // Return null if the image cannot be loaded
	    }
	}


}