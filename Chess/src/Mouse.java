

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.event.MouseInputListener;

public class Mouse implements MouseInputListener{

    int[] mousePosition;

    Piece selectedPiece;

    ArrayList<Piece> allPieces; // Assuming this is initialized elsewhere

    public Mouse(ArrayList<Piece> allPieces) {

        mousePosition = new int[]{-50, -100};

        this.allPieces = allPieces;

        selectedPiece = null;

    }



    @Override
    public void mouseClicked(MouseEvent e) {
        
    }


    @Override
    public void mousePressed(MouseEvent e) {
        for (int x=0;x<allPieces.size();x++) {
            if (allPieces.get(x).pos[0] <= e.getX() && allPieces.get(x).pos[0] + 80 >= e.getX() &&
                allPieces.get(x).pos[1] <= e.getY() && allPieces.get(x).pos[1] + 80 >= e.getY()) {
                selectedPiece = allPieces.get(x);
                System.out.println("Selected piece at: " + selectedPiece.pos[0] + ", " + selectedPiece.pos[1]);
                break;
            } else {
                selectedPiece = null;
            }
        }
        
    }


    @Override
    public void mouseReleased(MouseEvent e) {

    }


    @Override
    public void mouseEntered(MouseEvent e) {
    }


    @Override
    public void mouseExited(MouseEvent e) {

    }


    @Override
    public void mouseDragged(MouseEvent e) {
        if (selectedPiece != null) {
            selectedPiece.pos[0] = e.getX() - 40; // Assuming the piece is 80x80 pixels
            selectedPiece.pos[1] = e.getY() - 40; // Adjusting for the piece's center position
        }
    }


    @Override
    public void mouseMoved(MouseEvent e) {
        mousePosition = new int[]{e.getX(), e.getY()};
    }



    
}
