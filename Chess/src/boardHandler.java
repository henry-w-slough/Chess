import java.util.ArrayList;
import java.util.Arrays;

public class BoardHandler {

    ArrayList<Piece> allPieces = new ArrayList<Piece>();;

    ArrayList<String> initializationBoard;




    public BoardHandler() {

        this.allPieces = new ArrayList<Piece>();

        //used to initalize board
        this.initializationBoard = new ArrayList<String>(Arrays.asList(
            "r", "n", "b", "q", "k", "b", "n", "r", 
            "p", "p", "p", "p", "p", "p", "p", "p", 
            "-", "-", "-", "-", "-", "-", "-", "-", 
            "-", "-", "-", "-", "-", "-", "-", "-", 
            "-", "-", "-", "-", "-", "-", "-", "-", 
            "-", "-", "-", "-", "-", "-", "-", "-", 
            "P", "P", "P", "P", "P", "P", "P", "P", 
            "R", "N", "B", "Q", "K", "B", "N", "R"  
        ));
    }


}




