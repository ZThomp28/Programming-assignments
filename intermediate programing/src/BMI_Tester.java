import java.util.*;
public class BMI_Tester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("height in inches");
		int totalinches=in.nextInt();
		System.out.println("what is your name");
		String n = in.next();
		System.out.println("what is your age");
		int a = in.nextInt();
		System.out.println("what is your weight");
		double w = in.nextDouble();
		BMI b= new BMI(n,a,w,totalinches);
		System.out.println("Your BMI is "+b.getBMI());
		System.out.println(b.getStatus());
		System.out.println(b.getAge());
		System.out.println(b.getHeight());
		System.out.println(b.getName());
		System.out.println(b.getWeight());
		in.close();
	}

}
