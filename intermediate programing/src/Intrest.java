import java.util.*;
public class Intrest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double balance, rate;
		
		System.out.println("Enter your current balance");
		balance= in.nextDouble();
		System.out.println("Enter your intrest rate (in decimal format)");
		rate= in.nextDouble();
		in.close();
		
		double intrest=balance*rate;
		
		System.out.println("$"+intrest);

	}

}
