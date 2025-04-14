
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


		for (int i=0;i<64;i++) {
			if (gameHandler.fullBoard.get(i) == "P") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_pawn.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "p") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_pawn.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "R") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_rook.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "r") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_rook.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "B") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_bishop.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "b") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_bishop.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "N") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_knight.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "n") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_knight.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "K") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_king.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "k") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_king.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "Q") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_queen.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}
			else if (gameHandler.fullBoard.get(i) == "q") {
				gameHandler.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_queen.png"), (i % 8) * gamePanel.tileSize, (i / 8) * gamePanel.tileSize));
			}

			
		}



		//mouse for mouse event listening
		Mouse mouseListener = new Mouse();

		gamePanel.addMouseListener(mouseListener);
		gamePanel.addMouseMotionListener(mouseListener);





    	while (gamePanel.gameThread != null) {
    		gamePanel.run();


			for (int s=0;s<gameHandler.allPieces.size();s++) {
				if (gameHandler.allPieces.get(s).pos.x >= mouseListener.mousePosition.x) {
					gameHandler.allPieces.remove(gameHandler.allPieces.get(s));
				}
			}


			gamePanel.updatePieces(gameHandler.allPieces);
    	}
    	
    	
    	
    	
    	
    	


}


}


	






