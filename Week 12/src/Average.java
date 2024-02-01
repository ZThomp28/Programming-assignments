import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter testscor");
		double x=in.nextDouble();
		System.out.println("enter testscor");
		double y=in.nextDouble();
		System.out.println("enter testscor");
		double z=in.nextDouble();
		double grade = getscore(x,y,z);
		char lettergrade=getletter(grade);
		System.out.println("Test 1 score "+x+"|"+getletter(x));
		System.out.println("Test 2 score "+y+"|"+getletter(y));
		System.out.println("Test 3 score "+z+"|"+getletter(z));
		System.out.println("Your final grade is  "+grade+"|"+lettergrade);
		in.close();
	}
	public static double  getscore(double t1,double t2,double t3) {
		double sum , average;
		sum = t1+t2+t3;
		average= sum/3;
		return average;
	}
	
	public static char getletter(double score) {
		char letter;
		if (score>=90)
			letter ='A';
		else if (score>=80)
			letter ='B';
		else if (score>=70)
			letter ='C';
		else if (score>=60)
			letter ='D';
		else
			letter = 'F';
		return letter;
	}

}
