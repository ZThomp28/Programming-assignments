import java.util.Scanner;
public class Income_Tax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What was your income last year");
		double income = in.nextDouble();
		double tax = getTax(income);
		double incometax = income*tax;
		double total = income-incometax;
	
		in.close();
		
		System.out.println("Yor tax is "+tax*100+"% of your income");
		System.out.println("Your income tax is "+incometax);
		System.out.println("Your total after tax is "+total);
	}
	
	public static double getTax(double num){
		if (num<=50000)
			return 0.01;
		else if (num<=75000)
			return 0.02;
		else if (num<=100000)
			return 0.03;
		else if (num<=250000)
			return 0.04;
		else if (num<=500000)
			return 0.05;
		else if (num>500000)
			return 0.06;
		else
			return 0;

	}

}
