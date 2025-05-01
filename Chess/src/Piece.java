
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Piece {
    
    BufferedImage img;

    int[] pos;

    String pieceType;
    int pieceColor;


    ArrayList<int[]> possibleMoves;

    


    public Piece(BufferedImage img, String pieceType, int pieceColor, int x, int y) {

        this.img = img;
        
        
        this.pos = new int[]{x, y};

        this.pieceType = pieceType;
        this.pieceColor = pieceColor;
    
    }


    public ArrayList<int[]> getPossibleMoves() {

        if (pieceType == "pawn") {
            return new ArrayList<int[]>() {
                {
                    add(new int[]{pos[0], pos[1] - 80}); // Move forward
                }
            };
        }


        return new ArrayList<int[]>();
    }
}
