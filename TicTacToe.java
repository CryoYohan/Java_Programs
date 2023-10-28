package teenActivities;
public class TicTacToe {
	public static final int X = 1, O = -1; // players
	public static final int EMPTY = 0;		// Empty cells
	private int board[][] = new int[3][3];	// game board
	private int player;						// current player	
	// Constructor
	public TicTacToe() {clearBoard();};	
	// Clears the board
	public void clearBoard() {
		for(int i =0; i < 3; i++) 
			for(int j = 0; j < 3; j++) {
				board[i][j] = EMPTY;		// every cell should be empty;
			}
		player = X;							// First player is 'X'
		}
	// Puts an X or O mark at position i,j
	public void putMark(int i, int j) throws IllegalArgumentException {
		if((i<0) || (i>2) || (j<0) || (j>2))							// Traps inputs that are beyond the index of the board
			throw new IllegalArgumentException("Invalid board position"); // nice, i like this i'm new to this IllegalArgumentexception throw
		if(board[i][j] != EMPTY)
			throw new IllegalArgumentException("Board position occupied");
		board[i][j] = player; 			// place a mark on the current player
		player =- player;				// switch players (uses the fact that O =- X)
	}	
	// Checks whether the board configuration is a win for the given player
	public boolean isWin(int mark) {
		return ((board[0][0] + board[0][1] + board[0][2]) == mark * 3	 // row 0
				|| (board[0][1] + board[1][1] + board[1][2] == mark*3)	 // row 1
				|| (board[2][0] + board[2][1] + board[2][2] == mark*3)	 // row 2
				|| (board[0][0] + board[1][0] + board[2][0] == mark*3)	 // column 0
				|| (board[0][1] + board[1][1] + board[2][1] == mark*3)	 // column 1
				|| (board[0][2] + board[1][2] + board[2][2] == mark*3)	 // column 2	
				|| (board[0][0] + board[1][1] + board[2][2] == mark*3) 	 // diagonal		
				|| (board[2][0] + board[1][1] + board[0][2]) == mark*3); // reverse diagonal 
	}	
	// Returns the winning player's code , or 0 to indicate a tie (or unfinished game)
	public int winner() {
		if(isWin(X))
			return(X);
		else if(isWin(O))
			return(O);
		else
			return(0);
	}
	// Returns simple character string showing the current board
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				switch(board[i][j]) {
				case X: sb.append("X");break;
				case O: sb.append("O"); break;
				case EMPTY: sb.append(" ");break;
				}
				if(j<2)sb.append("|");
			}
			if(i<2)sb.append("\n-----\n");
		}
		return sb.toString();
	}				
}
