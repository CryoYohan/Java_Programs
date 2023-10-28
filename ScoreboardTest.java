package teenActivities;
public class ScoreboardTest {
	GameEntry users;
	public static void main(String[]args) {
		ScoreboardTest object = new ScoreboardTest(); // Created an object from the ScoreBoard class so i could call the functions within that class, add and remove.
		String name[] = {"Mike", "Rob", "Paul", "Anna", "Rose", "Jack"}; // String name values stored inside Object array
		int score[] = {1105,750,720,660,590,510};	// Integer score values stored inside Object Array
		Scoreboard capacity = new Scoreboard(7);	// Set capacity of Object Array to 7
		for(int i = 0; i < 6; i++) {
				object.users = new GameEntry(name[i], score[i]); // Initialize array values as objects within the Game Entry constructor
				capacity.add(object.users);		// Add the object values of the String name or integer score
		}
		System.out.println("Current Scoreboard:");
		capacity.display(); 		// Display the values inside the Object array
		String addName = "Jill"; 	// Created a String variable that will be added, namely, Jill
		int	addScore = 740;			// Created a Integer variable that will be added, parallel to its name, Jill, score is 740
		System.out.println("\nAttemping to add Jill with the score 740");
		object.users = new GameEntry(addName, addScore); // The two variables that contains the said values are initialized with the constructor.
		capacity.add(object.users);	// The two variables are stored within the users object and then added using the add method from the ScoreBoard
		System.out.println("\nUpdated Scoreboard:");
		capacity.display();			 // Displays the updated scoreboard
		System.out.println("\nRemoving entry at index 3:\nRemoved entry: (Paul, 720)\n");
		capacity.remove(3); 		// Removes the object values at index 3
		System.out.println("Final Scoreboard:");
		capacity.display();			// Displays the final scoreboard
	}
}
