import java.util.*;
public class Car_Tester {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Car x = new Car();
		System.out.println("Enter a car name");
		x.setmake(in.nextLine());
		System.out.println("Enter car Year");
		x.setmodelYear(in.nextInt());
		System.out.println(x.getmake());
		System.out.println(x.getmodelYear());
		in.close();
		
	}

}
