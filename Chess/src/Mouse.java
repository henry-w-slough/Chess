

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.event.MouseInputListener;

public class Mouse implements MouseInputListener{


    int[] mousePosition;
    int[] mouseSnappedPos;


    Piece selectedPiece;
    int[] selectedPieceLastPos;


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
        

        //"grabbing" piece on mouse click
        for (int x=0;x<allPieces.size();x++) {

            //if the mouse is between the x and x + width
            if (allPieces.get(x).pos[0] <= e.getX() && allPieces.get(x).pos[0] + 80 >= e.getX()) {
                //if the mouse is between the y and y + height
                if (allPieces.get(x).pos[1] <= e.getY() && allPieces.get(x).pos[1] + 80 >= e.getY()) {
                    selectedPiece = allPieces.get(x);
                }
            }

        }
        
    }




    @Override
    public void mouseReleased(MouseEvent e) {
        for (int s=0;s<allPieces.size();s++) {
            if (selectedPiece != null) {
                selectedPiece.pos[0] = closestNumber(selectedPiece.pos[0], 80);
                selectedPiece.pos[1] = closestNumber(selectedPiece.pos[1], 80);
            }
        }

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
        //if there is a piece, change it when the mouse drags it
        if (selectedPiece != null) {
            selectedPiece.pos[0] = e.getX() - 40; // Assuming the piece is 80x80 pixels
            selectedPiece.pos[1] = e.getY() - 40; // Adjusting for the piece's center position
        }
    }




    @Override
    public void mouseMoved(MouseEvent e) {
        //updating mouse position
        mousePosition = new int[]{e.getX(), e.getY()};
    }




    //function to round to the nearest number. Used for tile snapping
    static int closestNumber(int num, int divis) {
        // find the quotient
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;

        // Check numbers around n
        for (int i = num - Math.abs(divis); i <= num + Math.abs(divis); ++i) {
            if (i % divis == 0) {
                int difference = Math.abs(num - i);

                if (difference < minDifference || (difference == minDifference && Math.abs(i) > Math.abs(closest))) {
                    closest = i;
                    minDifference = difference;
                }
            }

        }

        return closest;
    }


    



    
}
