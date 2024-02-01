import java.util.Scanner;

public class Sum_of_Ten_Numbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum=0;
		for (int i=0;i<10;i++) {
			System.out.println("Enter a number");
			int num=in.nextInt();
			sum =sum+num;
			System.out.println("The current total - " +sum);
		}
		System.out.println("The total is - " +sum);
		in.close();
	}

}