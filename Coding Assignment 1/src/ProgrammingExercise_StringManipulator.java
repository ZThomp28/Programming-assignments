import java.util.Scanner;
public class ProgrammingExercise_StringManipulator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String city;

		System.out.println("What is your favorite city ");
		city = keyboard.nextLine();
		
		keyboard.close();
		
		System.out.println("Number of characters: " + city.length());
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println(city.charAt(0));
		

	}

}
