import java.util.*;
public class Programing_excersize {

	public static void main(String[] args) {
		String[] cars = new String[3];
		Scanner in =new Scanner(System.in);
		for (int i=0;i<cars.length;i++) {
			System.out.println("name a car");
			cars[i]=in.nextLine();
			
		}
		in.close();
		System.out.println(cars[0]+"\n"+cars[1]+"\n"+cars[2]);
	}

}
