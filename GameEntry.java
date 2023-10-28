package teenActivities;

public class GameEntry {

	private String name;
	private int score;
	// Constructs a game entry with a given parameter
	public GameEntry(String n, int s) {
		name = n;
		score = s;
	}
	
	//Getters for Name and Score
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	// Returns string representation of this entry
	public String toString() {
		return "(" + name + ", " + score + ")";
	}
	
}
