import java.awt.image.BufferedImage;

public class Piece {
    
    BufferedImage img;


    String pieceType;


    int x;
    int y;

    


    public Piece(BufferedImage img, String pieceType, int x, int y) {

        this.img = img;


        this.pieceType = pieceType;

        
        this.x = x;
        this.y = y;
        

        
    }
}
