
import javax.swing.JFrame;

import java.util.HashMap;

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


		HashMap<String, Piece> piecesMap = new HashMap<>();

		piecesMap.put("K", new Piece(gamePanel.loadImage("/sprites/w_king.png"), "king", 0, 0, 0));
		piecesMap.put("Q", new Piece(gamePanel.loadImage("/sprites/w_queen.png"), "queen", 0, 0, 0));
		piecesMap.put("P", new Piece(gamePanel.loadImage("/sprites/w_pawn.png"), "pawn", 0, 0, 0));
		piecesMap.put("R", new Piece(gamePanel.loadImage("/sprites/w_rook.png"), "rook", 0, 0, 0));
		piecesMap.put("B", new Piece(gamePanel.loadImage("/sprites/w_bishop.png"), "bishop", 0, 0, 0));
		piecesMap.put("N", new Piece(gamePanel.loadImage("/sprites/w_knight.png"), "knight", 0, 0, 0));

		piecesMap.put("k", new Piece(gamePanel.loadImage("/sprites/b_king.png"), "king", 1, 0, 0));
		piecesMap.put("q", new Piece(gamePanel.loadImage("/sprites/b_queen.png"), "queen", 1, 0, 0));
		piecesMap.put("p", new Piece(gamePanel.loadImage("/sprites/b_pawn.png"), "pawn",1, 0, 0));
		piecesMap.put("r", new Piece(gamePanel.loadImage("/sprites/b_rook.png"), "rook", 1, 0, 0));
		piecesMap.put("b", new Piece(gamePanel.loadImage("/sprites/b_bishop.png"), "bishop", 1, 0, 0));
		piecesMap.put("n", new Piece(gamePanel.loadImage("/sprites/b_knight.png"), "knight", 1, 0, 0));

		for (int i=0;i<64;i++) {
			if (gameHandler.fullBoard.get(i) != "-") {
				if (piecesMap.containsKey(gameHandler.fullBoard.get(i))) {
					gameHandler.allPieces.add(piecesMap.get(gameHandler.fullBoard.get(i)));
				}
			}
		}








				


		





    	while (gamePanel.gameThread != null) {
    		gamePanel.run();

			gamePanel.updatePieces(gameHandler.allPieces);
    	}
    	
    	
    	
    	
    	
    	


}


}


	






