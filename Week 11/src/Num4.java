import java.util.Scanner;
public class Num4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum=0;
		for (int i=0;i<6;i++) {
			System.out.println("Enter a number");
			int num=in.nextInt();
			sum =sum+num;
			System.out.println(sum);
		}
		in.close();
	}

}
