package teenActivities;
import java.util.Scanner;
public class TicTacToeTest {

	public static void main(String[]args) {
		int winningPlayer = 0, playersMove = 1, emptyCounter = 0;
		String[]outcome = {"Player O wins!","Tie", "Player X wins!"};
		Scanner sc = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		do {
			try { // This try catch catches invalid inputs 
				if(playersMove==1) { // Start of the game, displays the "Current Scoreboard" label
					System.out.println("Current board:\n");
					System.out.println(game);
				}			// Since there are a total of 9 moves together with player X and O...
				if(playersMove%2!=0)  // First player is X, starts with counter 1, if it's O's turn counter will be 2, O's turn is in the even side.
					System.out.println("Player X , please enter your move ( row and column )");
				else
					System.out.println("Player O , please enter your move ( row and column )");
				int i = sc.nextInt();
				int j = sc.nextInt();
				playersMove++; // Increments the counter to manipulate the two if conditions
				game.putMark(i, j); // places the mark within the putmark method in TicTacToe class
				System.out.println("Current board:\n\n" + game);
				winningPlayer = game.winner(); // stores int value of winner method inside a new variable
				if(winningPlayer == 0) {
					emptyCounter++; // Stores the EMPTY turns, will be used later in my while condition
				}
			}catch(Exception e) {
				System.out.println("Invalid input"); // catches errors, like an occupied position
				playersMove--; // Decrements the playersMove to avoid confusions in the print.out
				sc.nextLine(); // if user inputs non integer, this scanner eat em string/ char errors
			}
		}while(winningPlayer!=game.X && winningPlayer!=game.O && emptyCounter !=9);
		System.out.println(outcome[1 + winningPlayer]);		
	}
}
