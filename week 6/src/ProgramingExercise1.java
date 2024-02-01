import java.util.Scanner;
public class ProgramingExercise1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter anumber 1-10");
		n= num.nextInt();
		num.close();
		if (n==1)
		System.out.println("I");
		else if (n==2)
		System.out.println("II");
		else if (n==3)
		System.out.println("III");
		else if (n==4)
		System.out.println("IV");
		else if (n==5)
		System.out.println("V");
		else if (n==6)
		System.out.println("VI");
		else if (n==7)
		System.out.println("VII");
		else if (n==8)
		System.out.println("VIII");
		else if (n==9)
		System.out.println("IX");
		else
			System.out.println("X");
		

	}

}
