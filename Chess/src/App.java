
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
    	

    	//setting gamePanel "on top" of physical window
    	GamePanel gamePanel = new GamePanel();


		boardHandler gameHandler = new boardHandler();

		ArrayList<String> fullBoard = gameHandler.fullBoard;

		ArrayList<Piece> allPieces = gameHandler.allPieces;

    	window.add(gamePanel);
    	window.pack();
    	window.setLocationRelativeTo(null);
    	window.setVisible(true);


		for (int i=0;i<64;i++) {
			if (fullBoard.get(i) == "P") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_pawn.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (gameHandler.fullBoard.get(i) == "p") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_pawn.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (gameHandler.fullBoard.get(i) == "R") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_rook.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (fullBoard.get(i) == "r") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_rook.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (fullBoard.get(i) == "B") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_bishop.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (fullBoard.get(i) == "b") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_bishop.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (fullBoard.get(i) == "N") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_knight.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (fullBoard.get(i) == "n") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_knight.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (fullBoard.get(i) == "K") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_king.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (fullBoard.get(i) == "k") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_king.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (fullBoard.get(i) == "Q") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_queen.png"), (i % 8) * 80, (i / 8) * 80));
			}
			else if (fullBoard.get(i) == "q") {
				allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_queen.png"), (i % 8) * 80, (i / 8) * 80));
			}

			
		}



		//mouse for mouse event listening
		Mouse mouse = new Mouse(allPieces);

		gamePanel.addMouseListener(mouse);
		gamePanel.addMouseMotionListener(mouse);

		 




    	while (gamePanel.gameThread != null) {
                                               
    		gamePanel.run();

			
			gamePanel.allPieces = allPieces;

    	}
    	
    	
    	
    	
    	
    	


}


}


	






