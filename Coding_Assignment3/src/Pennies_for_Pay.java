import java.util.Scanner;
public class Pennies_for_Pay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many days did you work");
		int days=in.nextInt();
		System.out.println("Day\tPay");
		double res=0.01;
		for (int i=1;i<=days;i++) {
			if (i==1)
				;
			else
				res = res*2;
			System.out.println(i+"\t|$"+res);
		}
		
in.close();
	}

}
