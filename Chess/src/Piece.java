
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
        if (pieceType == "king") {
            return new ArrayList<>() {
                {
                    add(new int[]{pos[0] + 80, pos[1]});
                    add(new int[]{pos[0] - 80, pos[1]});
                    add(new int[]{pos[0], pos[1] + 80});
                    add(new int[]{pos[0], pos[1] - 80});
                    add(new int[]{pos[0] + 80, pos[1] + 80});
                    add(new int[]{pos[0] - 80, pos[1] - 80});
                    add(new int[]{pos[0] + 80, pos[1] - 80});
                    add(new int[]{pos[0] - 80, pos[1] + 80});
                }
            };
        }

        if (pieceType == "pawn") {
            return new ArrayList<int[]>() {
                {
                    if (pieceColor == 0) { // White pawn
                        add(new int[]{pos[0], pos[1] - 80}); // Move forward
                        if (pos[1] == 480) { // Starting position
                            add(new int[]{pos[0], pos[1] - 160}); // Double move forward
                        }
                    } else { // Black pawn
                        add(new int[]{pos[0], pos[1] + 80}); // Move forward
                        if (pos[1] == 160) { // Starting position
                            add(new int[]{pos[0], pos[1] + 160}); // Double move forward
                        }
                    }
                }
            };
        }


        return new ArrayList<int[]>();
    }
}
