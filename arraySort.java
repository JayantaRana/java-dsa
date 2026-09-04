// Java Program to Sort Array of Integers
// by Default Sorts in an Ascending Order
// using Arrays.sort() Method

// Importing Arrays class from the utility class
import java.util.Arrays;

// Main class
public class arraySort {

	// Main driver method
	public static void main(String[] args)
	{
		// Custom input array
		int[] arr = {  12, 4,  7,  9,  2,  23, 25, 41, 30,
            40, 28, 42, 30, 44, 48, 43, 50  };

		// Applying sort() method over to above array
		// by passing the array as an argument
		Arrays.sort(arr);

		// Printing the array after sorting
		System.out.println("Modified arr[] : "
						+ Arrays.toString(arr));
	}
}
