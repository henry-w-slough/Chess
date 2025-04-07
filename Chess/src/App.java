
import javax.swing.JFrame;

public class App {
// Main driver method
    public static void main(String[] args)
    {
    	JFrame window = new JFrame();
    	
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	window.setResizable(false);
    	window.setTitle("Chess");
    	

    	//setting gamePanel "on top" of physical window
    	GamePanel gamePanel = new GamePanel();

    	window.add(gamePanel);
    	window.pack();
    	window.setLocationRelativeTo(null);
    	window.setVisible(true);




		//setting up game (pieces, board, etc...)
		GameHandler gameHandler = new GameHandler();

		gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_king.png"), "king", 0, gameHandler.allSquares.indexOf("K") % 8 * 80, gameHandler.allSquares.indexOf("K") / 8 * 80));

		
    
    	


    	while (gamePanel.gameThread != null) {
    		gamePanel.run();
    	}
    	
    	
    	
    	
    	
    	
    }


	





}
