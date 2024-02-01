import java.util.Scanner;
public class Programing_Exercise6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int NUM=4;
		String[] car_names=new String[NUM];
		for (int i=0;i<NUM;i++) {
			System.out.println("Enter a car name");
			car_names[i]=in.nextLine();}
		for (int i=0;i<NUM;i++) {
			System.out.println(car_names[i]);}
in.close();
	}
	

}
