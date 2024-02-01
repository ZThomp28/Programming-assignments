import java.util.*;
public class Grade_Scale {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);
		
		double score;
		
		System.out.println("Enter your test score");
		score= grade.nextDouble();
		String letter = getGrade(score);
		System.out.println(letter);
		grade.close();
	}
		public static String getGrade( double num) {
			String x="Invalid Score";  
			
			if (num<60)
				return "Your grade is a "+"F :";
			else if (num<70)
				return "Your grade is a "+"D :";
			else if (num<80)
				return "Your grade is a "+"C :";
			else if (num<90)
				return "Your grade is a "+"B :";
			else if (num<=100&&num<101)
				return "Your grade is a "+"A :";
			else
				return x; 
			}
	

}
