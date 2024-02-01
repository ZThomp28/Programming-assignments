import java.util.Scanner;
public class Distance_Traveled {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What was your speed");
		double speed=in.nextDouble();
		System.out.println("How long was the drive");
		double time=in.nextDouble();
		System.out.println("Hour \t Distance travled \r\n_________________________");
		double distance;
		for (int x=1;x<=time;x++) {
			distance = speed *x;
			System.out.println(x+"\t| " + distance);
		}
		in.close();
	}

}
