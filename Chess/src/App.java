
import java.util.ArrayList;

import javax.swing.JFrame;




public class App {
// Main driver method
    public static void main(String[] args)
    {
    	JFrame window = new JFrame();
    	
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	window.setResizable(false);
    	window.setTitle("Chess");
		window.setVisible(true);
    	


    	//setting gamePanel "on top" of physical window
    	GamePanel gamePanel = new GamePanel();


		BoardHandler boardHandler = new BoardHandler();

		ArrayList<Piece> allPieces = boardHandler.allPieces;

		//binds the window to the gamePanel for customization through the gamePanel class
    	window.add(gamePanel);
		//setting window to specified size
    	window.pack();



		//adding all pieces to the board before main loop begins
		for (int i=0;i<64;i++) {

			if (boardHandler.initializationBoard.get(i) == "P") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_pawn.png"), "pawn", 0, (i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "p") {
				boardHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_pawn.png"), "pawn", 1, (i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "R") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_rook.png"), "rook", 0, (i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "r") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_rook.png"), "rook", 1, (i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "B") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_bishop.png"), "bishop", 0, (i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "b") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_bishop.png"), "bishop", 1, (i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "N") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_knight.png"), "knight", 0, (i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "n") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_knight.png"), "knight", 1, (i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "K") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_king.png"), "king", 0, (i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "k") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_king.png"), "king", 1, (i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "Q") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_queen.png"), "queen", 0,(i % 8) * 80, (i / 8) * 80));
			}
			else if (boardHandler.initializationBoard.get(i) == "q") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_queen.png"), "queen", 1, (i % 8) * 80, (i / 8) * 80));
			}

			
		}

		gamePanel.allPieces = allPieces;



		//mouse for mouse event listening per Mouse class
		Mouse mouse = new Mouse(allPieces);

		gamePanel.addMouseListener(mouse);
		gamePanel.addMouseMotionListener(mouse);

		 



		
    	while (gamePanel.gameThread != null) {

			//drawing sprites to the screen per the gamePanel function
			gamePanel.run();
        
    	}
    	
    	
    	
    	
    	
    	


}


}


	






