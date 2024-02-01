import java.util.*;
public class Larger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Enter a number (Whole number)");
		num1= in.nextInt();
		System.out.println("Enter another number (Whole number)");
		num2= in.nextInt();
		in.close();
		
		if (num1>num2)
			System.out.println("The first number is larger than the second");
		else if (num2>num1)
			System.out.println("The second number is larger than the fist");
		else
			System.out.println("numbers are equal");
	}

}
