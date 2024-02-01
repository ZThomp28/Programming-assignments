
public class CheckPoint2 {

	public static void main(String[] args) {
		double a=1, b=5, c=6;
		double root1, root2;
			
	root1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
	root2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
	
	System.out.println("the first root is"+root1);
	System.out.println("the secont root is"+root2);

	}

}
