import java.util.Scanner;
public class ProgramingExercise2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double payment, statetax, countytax;
		
		System.out.println("Purchase amount $");
		payment = keyboard.nextDouble();
		
		statetax = payment*0.04;
		countytax = payment*0.02;
		double totaltax = statetax+countytax;
		double totalamount = payment +totaltax;
		
		keyboard.close();
		
		System.out.println("State tax is $"+statetax);
		System.out.println("County tax is $"+countytax);
		System.out.println("Total tax is $"+totaltax);
		System.out.println("Payment amount is $"+totalamount);
		
	}

}
