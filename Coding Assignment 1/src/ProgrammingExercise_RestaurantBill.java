import java.util.Scanner;
public class ProgrammingExercise_RestaurantBill {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		
		double tax, mealc, tip, total, total_tip;
		
		System.out.println("How much was your meal?");
		mealc = text.nextDouble();
		
		tax = mealc * 0.0675;
		total = mealc + tax;
		tip = total *0.15;
		total_tip = total + tip;
		
		text.close();
		
		System.out.println("Your meal cost $" + mealc);
		System.out.println("The tax on your meal is $" + tax);
		System.out.println("Your tip is $" + tip);
		System.out.println("Thank you for your purchace your total is $" + total);
		System.out.println("Your total including tip $" + total_tip);

	}

}
