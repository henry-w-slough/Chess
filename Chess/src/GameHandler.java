import java.util.ArrayList;
import java.util.Arrays;

public class GameHandler {

    ArrayList<Piece> allPieces = new ArrayList<Piece>();


    ArrayList<String> fullBoard = new ArrayList<String>(Arrays.asList(
        "R", "N", "B", "Q", "K", "B", "N", "R", 
        "P", "P", "P", "P", "P", "P", "P", "P", 
        "-", "-", "-", "-", "-", "-", "-", "-", 
        "-", "-", "-", "-", "-", "-", "-", "-", 
        "-", "-", "-", "-", "-", "-", "-", "-", 
        "-", "-", "-", "-", "-", "-", "-", "-", 
        "p", "p", "p", "p", "p", "p", "p", "p", 
        "r", "n", "b", "q", "k", "b", "n", "r"  
    ));




    public GameHandler() {
    }


}




