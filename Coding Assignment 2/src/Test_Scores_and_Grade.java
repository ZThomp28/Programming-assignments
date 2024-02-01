import java.util.Scanner;
public class Test_Scores_and_Grade {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);
				
		double g1,g2,g3,averagegrade;
		
		System.out.println("Enter first gradescore");
		g1= grade.nextDouble();
		System.out.println("Enter second gradescore");
		g2= grade.nextDouble();
		System.out.println("Enter third gradescore");
		g3= grade.nextDouble();
		averagegrade=(g1+g2+g3)/3;
		
		grade.close();
		
		if (averagegrade<60)
			System.out.println("Your grade is a "+"F :"+averagegrade);
		else if (averagegrade<70)
			System.out.println("Your grade is a "+"D :"+averagegrade);
		else if (averagegrade<80)
			System.out.println("Your grade is a "+"C :"+averagegrade);
		else if (averagegrade<90)
			System.out.println("Your grade is a "+"B :"+averagegrade);
		else if (averagegrade<=100)
			System.out.println("Your grade is a "+"A :"+averagegrade);
		else
			System.out.println("Your grade is not on the scale");
		
	}

}
