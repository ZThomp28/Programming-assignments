import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_11_11 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create an ArrayList of Integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt the user to enter 5 numbers
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}

		// Stort numbers
		sort(list);

		// Display list in increasing order
		System.out.println(list.toString());
	}

	/** Sorts an ArrayList of Integers */
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}
}
