
import java.awt.image.BufferedImage;

public class Piece {
    
    BufferedImage img;

    int[] pos;

    String pieceType;
    int pieceColor;

    


    public Piece(BufferedImage img, String pieceType, int pieceColor, int x, int y) {

        this.img = img;
        
        
        this.pos = new int[]{x, y};

        this.pieceType = pieceType;
        this.pieceColor = pieceColor;
    
    }

    //instead of returning an arraylist
    public boolean isMovePossible(int[] move) {
                                        
        if (this.pieceType == "pawn") {
            if (move[1] == this.pos[1] - 160) {
                return true;
            }
        }

        System.out.println("MOVE: "+move[0]+" "+move[1]+"  POS: "+this.pos[0]+" "+this.pos[1]);
        return false;
    }
}
