

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

        mousePosition = new int[]{-100, -100};


        this.allPieces = allPieces;
    
        selectedPiece = null;
        selectedPieceLastPos = new int[]{400, 400};



    }




    @Override
    public void mouseClicked(MouseEvent e) {
        
    }




    @Override
    public void mousePressed(MouseEvent e) {
        
        // "Grabbing" a piece on mouse click
        for (Piece piece : allPieces) {
            // Check if the mouse is within the bounds of the piece
            if (piece.pos[0] <= e.getX() && piece.pos[0] + 80 >= e.getX() &&
                piece.pos[1] <= e.getY() && piece.pos[1] + 80 >= e.getY()) {
                selectedPiece = piece;
                selectedPieceLastPos = new int[]{piece.pos[0], piece.pos[1]}; // Store the last position
                break;
            }
        }
        
    }




    @Override
    public void mouseReleased(MouseEvent e) {


        //removing, moving, and snapping piece functionality
        //iterating through every piece for checks
        for (Piece piece : allPieces) {


            //if there is a piece selected by the mouse
            if (selectedPiece != null) {
                selectedPiece.pos[0] = closestNumber(selectedPiece.pos[0], 80);
                selectedPiece.pos[1] = closestNumber(selectedPiece.pos[1], 80);

                //makes sure the piece isn't the same as the one selected
                if (piece != selectedPiece) {
                    //logic for removing piece // if the positions are the same, remove the piece
                    if (piece.pos[0] == selectedPiece.pos[0] && piece.pos[1] == selectedPiece.pos[1]) {
                        if (piece.pieceColor != selectedPiece.pieceColor) {
                            //removal
                            allPieces.remove(piece);
                        }   
                        else {
                            //if the piece is the same color, reset the position of the selected piece
                            selectedPiece.pos[0] = selectedPieceLastPos[0];
                            selectedPiece.pos[1] = selectedPieceLastPos[1];
                        }
                    }
                }
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
