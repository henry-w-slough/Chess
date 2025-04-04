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
    	
  
    	
    	//displaying background
    	gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/board_sprite.png"), 0, 0));

        initializeSprites(gamePanel, gameHandler);
		
		
    
    	
    	while (gamePanel.gameThread != null) {
    		gamePanel.run();
    	}
    	
    	
    	
    	
    	
    	
    }








    public static void initializeSprites(GamePanel gamePanel, GameHandler gameHandler) {
        //initalizing every piece onto the screen in their default positions
        for (int i=0;i<60;i++) {
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/w_pawn.png"), gameHandler.bitboardToScreenPos(gameHandler.whitePawnPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.whitePawnPos, i)[1]));
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/w_king.png"), gameHandler.bitboardToScreenPos(gameHandler.whiteKingPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.whiteKingPos, i)[1]));
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/w_queen.png"), gameHandler.bitboardToScreenPos(gameHandler.whiteQueenPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.whiteQueenPos, i)[1]));
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/w_bishop.png"), gameHandler.bitboardToScreenPos(gameHandler.whiteBishopPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.whiteBishopPos, i)[1]));
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/w_knight.png"), gameHandler.bitboardToScreenPos(gameHandler.whiteKnightPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.whiteKnightPos, i)[1]));
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/w_rook.png"), gameHandler.bitboardToScreenPos(gameHandler.whiteRookPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.whiteRookPos, i)[1]));
            
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/b_pawn.png"), gameHandler.bitboardToScreenPos(gameHandler.blackPawnPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.blackPawnPos, i)[1]));
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/b_king.png"), gameHandler.bitboardToScreenPos(gameHandler.blackKingPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.blackKingPos, i)[1]));
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/b_queen.png"), gameHandler.bitboardToScreenPos(gameHandler.blackQueenPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.blackQueenPos, i)[1]));
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/b_bishop.png"), gameHandler.bitboardToScreenPos(gameHandler.blackBishopPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.blackBishopPos, i)[1]));
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/b_knight.png"), gameHandler.bitboardToScreenPos(gameHandler.blackKnightPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.blackKnightPos, i)[1]));
            
            gamePanel.displayedSprites.add(new Sprite(gamePanel.loadImage("/b_rook.png"), gameHandler.bitboardToScreenPos(gameHandler.blackRookPos, i)[0], gameHandler.bitboardToScreenPos(gameHandler.blackRookPos, i)[1]));
        }
    }

}
