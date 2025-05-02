

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

        if (selectedPiece == null) {
            return;
        }


        if (selectedPiece.isMovePossible(roundPosition(mousePosition, 80))) {
            selectedPiece.pos = roundPosition(mousePosition, 80);
            //removing, moving, and snapping piece functionality
            //iterating through every piece for checks
            for (int x=0;x<allPieces.size();x++) {
                Piece piece = allPieces.get(x);

                if (selectedPiece == piece) {
                    return;
                }

                //logic for removing piece // if the positions are the same, remove the piece
                if (piece.pos[0] == selectedPiece.pos[0] && piece.pos[1] == selectedPiece.pos[1]) {

                    if (piece.pieceColor != selectedPiece.pieceColor) {
                        //removal
                        allPieces.remove(piece);
                    }    
                    //if pieces are the same color
                    else {
                        //reset the position of the selected piece
                        selectedPiece.pos[0] = selectedPieceLastPos[0];
                        selectedPiece.pos[1] = selectedPieceLastPos[1];
                    }
                }
                
            }

            //snapping piece to grid (no matter where it is)
            selectedPiece.pos = roundPosition(selectedPiece.pos, 80);
        }

        else {
            selectedPiece.pos[0] = selectedPieceLastPos[0];
            selectedPiece.pos[1] = selectedPieceLastPos[1];
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




    // function to round the number
    static int[] roundPosition(int[] pos, int divis)
    {
        //first number
        // Smaller multiple
        int a = (pos[0] / divis) * divis;
         
        // Larger multiple
        int b = a + divis;
     
        // Return of closest of two
        int x = (pos[0] - a >= b - pos[0])? b : a;

        //second number
        // Smaller multiple
        a = (pos[1] / divis) * divis;
         
        // Larger multiple
        b = a + divis;
     
        // Return of closest of two
        int y = (pos[1] - a >= b - pos[1])? b : a;

        return new int[]{x, y};
    }


    



    
}
