
public class Sum_of {

	public static void main(String[] args) {
		System.out.println("The sum of the numbers between 1 to 10 is "+sum(1,10));
		System.out.println("The sum of the numbers between 20 to 30 is "+sum(20,30));
		System.out.println("The sum of the numbers between 35 to 45 is "+sum(35,45));
	}
	public static int sum( int num1, int num2) {
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			sum=sum+i;
		}
		return sum;		
	}	
}
