
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Piece {
    
    BufferedImage img;

    int[] pos;


    ArrayList<Integer> possibleMoves;

    


    public Piece(BufferedImage img, int x, int y) {

        this.img = img;
        
        
        this.pos = new int[]{x, y};


        this.possibleMoves = new ArrayList<Integer>();
        

        
    }
}
