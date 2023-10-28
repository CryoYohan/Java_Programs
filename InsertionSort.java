package teenActivities;
import java.util.Arrays;
public class InsertionSort {
	char[] data = {'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F'}; // The sample data to sort, not in order
	public InsertionSort() {
		System.out.println(" " + Arrays.toString(data) + " Before insertion...");	// Prints the data before it's sorted
		insertionSort(data);	// Called the insertion method an passed the char array, "data", as an argument
	}
	public void insertionSort(char[] data) {
		int n = data.length;	// length of the array stored inside a variable
		for(int k=1; k <n; k++) {
			char cur = data[k]; // Current letter
			int j = k;			// stores k value inside int variable j to evaluate in while loop
			while(j > 0 && data[j-1] > cur) { // while the first letter is greater than the 2nd letter...
				data[j] = data[j-1];		  // move first letter to the right
				j--;						 // decrements j, this controls the while loop
			}
			data[j] = cur;		// this is the proper place for cur
			switch(k) {			// I used switched case in every k iteration to display the different letters C,D,A,E,H,G,F
			case 1:
				System.out.println("C " + Arrays.toString(data));
				break;
			case 2:
				System.out.println("D " + Arrays.toString(data));
				break;
			case 3:
				System.out.println("A " + Arrays.toString(data));
				break;
			case 4:
				System.out.println("E " + Arrays.toString(data));
				break;
			case 5:
				System.out.println("H " + Arrays.toString(data));
				break;
			case 6:
				System.out.println("G " + Arrays.toString(data));
				break;
			case 7:
				System.out.println("F " + Arrays.toString(data));
				break;
			}
		}
		System.out.println(" " + Arrays.toString(data) + " After insertion..."); // Prints out the arranged version of the data
	}
}
