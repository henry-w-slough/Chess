import java.util.ArrayList;
import java.util.Arrays;

public class GameHandler {


    ArrayList<String> allSquares = new ArrayList<String>();
    ArrayList<Piece> allPieces = new ArrayList<Piece>();


    // Define the initial board setup
    String[] initialSetup = {
        "R", "N", "B", "Q", "K", "B", "N", "R", // White pieces (row 1)
        "P", "P", "P", "P", "P", "P", "P", "P", // White pawns (row 2)
        "-", "-", "-", "-", "-", "-", "-", "-", // Empty squares (row 3)
        "-", "-", "-", "-", "-", "-", "-", "-", // Empty squares (row 4)
        "-", "-", "-", "-", "-", "-", "-", "-", // Empty squares (row 5)
        "-", "-", "-", "-", "-", "-", "-", "-", // Empty squares (row 6)
        "p", "p", "p", "p", "p", "p", "p", "p", // Black pawns (row 7)
        "r", "n", "b", "q", "k", "b", "n", "r"  // Black pieces (row 8)
    };




    public GameHandler() {

        allSquares.addAll(Arrays.asList(initialSetup));

    }


}




