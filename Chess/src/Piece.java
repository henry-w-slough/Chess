import java.awt.image.BufferedImage;

public class Piece {
    
    BufferedImage img;


    String pieceType;

	int color;


    int x;
    int y;

    


    public Piece(BufferedImage img, String pieceType, int color, int x, int y) {

        this.img = img;


        this.pieceType = pieceType;
		
		this.color = color;

        
        this.x = x;
        this.y = y;
        

        
    }
}
