

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.event.MouseInputListener;

public class Mouse implements MouseInputListener{

    int[] mousePosition;

    Piece selectedPiece;

    ArrayList<Piece> allPieces; // Assuming this is initialized elsewhere

    public Mouse(ArrayList<Piece> allPieces) {

        mousePosition = new int[]{-100, -100};

    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }


    @Override
    public void mousePressed(MouseEvent e) {
        // Check if the mouse is over a piece and select it
        for (Piece piece : ) { // Assuming GamePanel.allPieces is accessible
            if (e.getX() >= piece.pos[0] && e.getX() <= piece.pos[0] + 80 &&
                e.getY() >= piece.pos[1] && e.getY() <= piece.pos[1] + 80) {
                selectedPiece = piece;
                break;
            }
        }
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        selectedPiece = null;

    }


    @Override
    public void mouseEntered(MouseEvent e) {
    }


    @Override
    public void mouseExited(MouseEvent e) {

    }


    @Override
    public void mouseDragged(MouseEvent e) {
        mousePosition[0] = e.getX();
        mousePosition[1] = e.getY();

    }


    @Override
    public void mouseMoved(MouseEvent e) {

    }



    
}
