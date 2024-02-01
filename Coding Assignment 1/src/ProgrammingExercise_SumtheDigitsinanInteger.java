import java.util.Scanner;
public class ProgrammingExercise_SumtheDigitsinanInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input 3 digits:");
		
		int inpute = in.nextInt();
		int n3 = (inpute / 100) % 10;
	    int n2 = (inpute / 10) % 10;
	    int n1 = inpute % 10;
	    
	    in.close();
	    
	   int sum = n1+n2+n3;
	   
	   System.out.println("The sum of the three numbers is " + sum);

	}

}
