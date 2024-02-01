import java.util.Scanner;
public class programingExercise1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double score1, score2, score3;
		
		System.out.println("Enter the first score");
		score1 = keyboard.nextDouble();
		
		System.out.println("Enter the second score");
		score2 = keyboard.nextDouble();
		
		System.out.println("Enter the third score");
		score3 = keyboard.nextDouble();

		double averageScore = (score1 + score2 + score3)/3;
		
		keyboard.close();
		
		System.out.println("Your first score is " +score1);
		System.out.println("Your second score is " +score2);
		System.out.println("Your third score is" + score3);
		System.out.println("Your average score is" + averageScore);
	}

}
