import java.util.Scanner;
public class ProgrammingExercise_DigitExtractor {

	public static void main(String[] args) {

		        Scanner in = new Scanner(System.in);
		        System.out.print("Input five positive digits: ");
		        
		        // parenthesis are not needed, but it does make it easier to see the order of the operation
		        /* the calculations position the impute so the remainder is equivalent to the 
		          corresponding placement*/
		         		        
		        int inpute = in.nextInt();
		        int n5 = (inpute / 10000) % 10;
		        int n4 = (inpute / 1000) % 10;
		        int n3 = (inpute / 100) % 10;
		        int n2 = (inpute / 10) % 10;
		        int n1 = inpute % 10;
		        
		        in.close();
		        //using new lines will make the out put vertical
		        
		      System.out.println( n1 + "\r\n " + n2 + "\r\n" + n3 + "\r\n" + n4 + "\r\n" + n5);

	}

}
