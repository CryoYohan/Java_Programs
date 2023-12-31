package teenActivities;
// Class for storing high scores in an array in non decreasing order
public class Scoreboard {
	private int numEntries = 0;
	private GameEntry[] board;
	// Constructs an empty scoreboard with the given capacity for storing entries.
	public Scoreboard(int capacity) {
		board = new GameEntry[capacity];
	}
	// Attempt to add a new score to the collection (if it is high enough)
	public void add(GameEntry e) {
		int newScore = e.getScore();
		// is the new score really a high score?
		if(numEntries < board.length || newScore > board[numEntries-1].getScore()) {
			if(numEntries < board.length)
				numEntries++;
			//shifts any lower scores rightward to make room for the new entry
			int j = numEntries - 1;
			while(j > 0 && board[j-1].getScore() < newScore) {
				board[j] = board[j-1];		// shifts entry from j-1 to j
				j--; 						// and decrement j
			}
			board[j] = e;					// when done, add new entry
		}
	}
	// Remove and return the high score at index i
	public GameEntry remove(int i) throws IndexOutOfBoundsException {
		if(i<0 || i >= numEntries)
			throw new IndexOutOfBoundsException("Invalid index at" + i);
		GameEntry temp = board[i]; 			// Save the object to be removed
		for(int j=i; j <numEntries-1;j++)  // count up from i (not down)
			board[j] = board[j+1];			// move one cell to the left
		board[numEntries-1] = null;			// null the old last score
		numEntries--;
		return temp;
	}
	// Displays the objects stored within the array
	public void display() {
		for(int i = 0; i < board.length; i++) {
			if(board[i] == null)
				continue;
			else
				System.out.println( "Entry " + (i+1) + ": " + board[i].toString());
		}
	}
}
