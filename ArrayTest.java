package teenActivities;
import java.util.Random;
import java.util.Arrays;
public class ArrayTest {
	public static void main(String[] args) {
		int data[] = new int[10];
		Random rand = new Random(); 	// a pseudo-random number generator
		rand.setSeed(System.currentTimeMillis()); // use current time as a seed
		// fill the data array with pseudo-random numbers to 0-99, inclusive
		for(int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(100);	// the next pseudo-random number
		}
			int[] orig = Arrays.copyOf(data, data.length); // make a copy of the data array
			System.out.println("arrays equal before sort: " + Arrays.equals(data, orig));
			Arrays.sort(data);			// Sorting the data array(orig is unchanged)
			System.out.println("arrays equal after sort: " + Arrays.equals(data, orig));
			System.out.println("orig = " + Arrays.toString(orig));
			System.out.println("data = " + Arrays.toString(data));
	}
	// Edit
}
