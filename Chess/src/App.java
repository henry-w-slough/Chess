
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
    	
    	
    	  
    	//initalizing game handler for game-related materials
    	GameHandler gameHandler = new GameHandler();

		for (int p=0;p<8;p++) {
            gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_pawn.png"), gameHandler.getBoardPos(gameHandler.whitePawnPos, p)[0], gameHandler.getBoardPos(gameHandler.whitePawnPos, p)[1]));
			gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_pawn.png"), gameHandler.getBoardPos(gameHandler.blackPawnPos, p)[0], gameHandler.getBoardPos(gameHandler.blackPawnPos, p)[1]));
        }

		for (int p=0;p<1;p++) {
            gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_king.png"), gameHandler.getBoardPos(gameHandler.whiteKingPos, p)[0], gameHandler.getBoardPos(gameHandler.whiteKingPos, p)[1]));
			gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_king.png"), gameHandler.getBoardPos(gameHandler.blackKingPos, p)[0], gameHandler.getBoardPos(gameHandler.blackKingPos, p)[1]));

			gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_queen.png"), gameHandler.getBoardPos(gameHandler.whiteQueenPos, p)[0], gameHandler.getBoardPos(gameHandler.whiteQueenPos, p)[1]));
			gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_queen.png"), gameHandler.getBoardPos(gameHandler.blackQueenPos, p)[0], gameHandler.getBoardPos(gameHandler.blackQueenPos, p)[1]));
        }

		for (int p=0;p<2;p++) {
			gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_bishop.png"), gameHandler.getBoardPos(gameHandler.whiteBishopPos, p)[0], gameHandler.getBoardPos(gameHandler.whiteBishopPos, p)[1]));
			gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_bishop.png"), gameHandler.getBoardPos(gameHandler.blackBishopPos, p)[0], gameHandler.getBoardPos(gameHandler.blackBishopPos, p)[1]));
			
			gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_knight.png"), gameHandler.getBoardPos(gameHandler.whiteKnightPos, p)[0], gameHandler.getBoardPos(gameHandler.whiteKnightPos, p)[1]));
			gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_knight.png"), gameHandler.getBoardPos(gameHandler.blackKnightPos, p)[0], gameHandler.getBoardPos(gameHandler.blackKnightPos, p)[1]));
		
			gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/w_rook.png"), gameHandler.getBoardPos(gameHandler.whiteRookPos, p)[0], gameHandler.getBoardPos(gameHandler.whiteRookPos, p)[1]));
			gamePanel.allPieces.add(new Piece(gamePanel.loadImage("/sprites/b_rook.png"), gameHandler.getBoardPos(gameHandler.blackRookPos, p)[0], gameHandler.getBoardPos(gameHandler.blackRookPos, p)[1]));
		}

		
		
		//gameHandler.blackPawnPos
		
    
    	
    	while (gamePanel.gameThread != null) {

            


    		gamePanel.run();
    	}
    	
    	
    	
    	
    	
    	
    }


}
