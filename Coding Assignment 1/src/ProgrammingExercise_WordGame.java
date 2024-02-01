import java.util.Scanner;
public class ProgrammingExercise_WordGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name, age, city, college, profession, animal, petsname;
		
		System.out.println("What is your Name ");
		name = keyboard.nextLine();
		System.out.println("What is your age ");
		age = keyboard.nextLine();
		System.out.println("Name a city ");
		city = keyboard.nextLine();
		System.out.println("Name a college ");
		college = keyboard.nextLine();
		System.out.println("Name a profession ");
		profession = keyboard.nextLine();
		System.out.println("Name any animal ");
		animal = keyboard.nextLine();
		System.out.println("Give a pet name ");
		petsname = keyboard.nextLine();
		
		keyboard.close();
		
		System.out.println("There once was a person named " + name + " who live in " + city +". At the age of " + age + " " + name + " went to"	+ "college at " + college + ". \r\n" + name + " graduated and went to work as a " + profession + ". " + "Then, " + name + " adopted a(n) " + animal + " named " + petsname + ". They both lived happily ever after!" );

	}

}
