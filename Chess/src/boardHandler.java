import java.util.ArrayList;
import java.util.Arrays;

public class boardHandler {

    ArrayList<Piece> allPieces = new ArrayList<Piece>();;

    ArrayList<String> fullBoard;




    public boardHandler() {

        this.allPieces = new ArrayList<Piece>();


        this.fullBoard = new ArrayList<String>(Arrays.asList(
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




