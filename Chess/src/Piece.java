
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


        this.possibleMoves = new ArrayList<int[]>();

        this.pieceType = pieceType;
        this.pieceColor = pieceColor;
    
    }


    public int[] getPossibleMoves() {
        if (pieceType == "king") {
            possibleMoves.add(new int[]{pos[0] - 80, pos[1], pos[0] + 80, pos[1], pos[0], pos[1] - 80, pos[1] + 80});
        }

        if (pieceType == "pawn") {
            possibleMoves.add(new int[]{pos[0], pos[1]-80});
        }


        return new int[] {1};
    }
}
