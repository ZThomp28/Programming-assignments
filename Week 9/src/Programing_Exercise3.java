import java.util.Scanner;
public class Programing_Exercise3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a letter(case does not matter)");
		String c= in.next();
		char s = c.charAt(0);
		while (s!='y'&&s!='Y'&&s!='n'&&s!='N') {
			System.out.println("Try Y or N");
			c= in.next();
			s= c.charAt(0);
		}
		System.out.println("Correct");
		
in.close();
	}

}
