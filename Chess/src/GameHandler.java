
public class GameHandler {

    // every single bitboard for every single piece. Each 64x long represents 64 bits, or 64 positions on the board.
    long boardBits;

    long whitePawnPos;
    long whiteRookPos;
    long whiteKnightPos;
    long whiteBishopPos;
    long whiteKingPos;
    long whiteQueenPos;

    long blackPawnPos;
    long blackRookPos;
    long blackKnightPos;
    long blackBishopPos;
    long blackKingPos;
    long blackQueenPos;


    public GameHandler() {

        // Initialize bitboards with default positions

    	//      		   1234567812345678123456781234567812345678123456781234567812345678
        this.boardBits = 0b0000000011111111000000000000000000000000000000001111111000000000L;

        //                    1234567812345678123456781234567812345678123456781234567812345678
        this.whitePawnPos = 0b0000000011111111000000000000000000000000000000000000000000000000L;
        this.blackPawnPos = 0b0000000000000000000000000000000000000000000000001111111100000000L;

        //      			  1234567812345678123456781234567812345678123456781234567812345678
        this.whiteRookPos = 0b1000000100000000000000000000000000000000000000000000000000000000L;
        this.blackRookPos = 0b0000000000000000000000000000000000000000000000000000000010000001L;

        //      				1234567812345678123456781234567812345678123456781234567812345678
        this.whiteKnightPos = 0b0100001000000000000000000000000000000000000000000000000000000000L;
        this.blackKnightPos = 0b0000000000000000000000000000000000000000000000000000000001000010L;

        //      			 	1234567812345678123456781234567812345678123456781234567812345678
        this.whiteBishopPos = 0b0010010000000000000000000000000000000000000000000000000000100010L;
        this.blackBishopPos = 0b0000000000000000000000000000000000000000000000000000000000100100L;

        //      			  1234567812345678123456781234567812345678123456781234567812345678
        this.whiteKingPos = 0b0001000000000000000000000000000000000000000000000000000000000000L;
        this.blackKingPos = 0b0000000000000000000000000000000000000000000000000000000000010000L;

        //      			   1234567812345678123456781234567812345678123456781234567812345678
        this.whiteQueenPos = 0b0000100000000000000000000000000000000000000000000000000000000000L;
        this.blackQueenPos = 0b0000000000000000000000000000000000000000000000000000000000001000L;

    }

    
    

    //function that returns a screen coordinate based on a given indexed piece of a bitboard.
    public int[] bitboardToScreenPos(long bitboard, int index) {

    	int posIndex = 0;
    	int x = 0;
    	int y = 0;

    	//for every bit in the bitboard given
        for (int i=0;i<64;i++) {
        	
        	//bitwise operation to check for a 1 in the bitboard
        	if ((bitboard & (1L << i)) != 0) {
        		//defining x and y based on the 1's
                x = i % 8;
                y = i / 8;
      
                //comparing the index of which piece of the piece type you index.
                posIndex += 1;
                if (posIndex == index) {
                	break;                	
                }
                
                
        	}
        }
        
        
        //* by 80 in order to scale the coords to the size of the screen
        int[] pos = {x*80, y*80};
        return pos;
    }






}