import java.util.Scanner;
public class Programing_Exercise2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number 10-24");
		int num=in.nextInt();
		while (num<10||num>24) {
			System.out.println("Number must be between 10-24");
			num=in.nextInt();}
		System.out.println(num);
			in.close();	

	}

}
