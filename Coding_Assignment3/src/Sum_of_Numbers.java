import java.util.Scanner;
public class Sum_of_Numbers {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a positive number");
	int num = in.nextInt();
	int sum = 0;
	for (int i=1;i<=num;i++) {
		sum=sum+i;
		System.out.println(i+"|"+sum);
	}
in.close();
	}

}
