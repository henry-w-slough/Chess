import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Piece {
    
    BufferedImage img;

    Point pos;


    ArrayList<Integer> possibleMoves;

    


    public Piece(BufferedImage img, int x, int y) {

        this.img = img;
        
        
        this.pos = new Point(x, y);


        this.possibleMoves = new ArrayList<Integer>();
        

        
    }
}
