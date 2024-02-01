import java.util.*;
public class Unique_average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total;
		System.out.println("How many numbers are there");
		total=in.nextInt();
		int[] a = new int[total];
		double average;
		int sum=0, current;
		for(int i=0;i<total;i++) {
			System.out.println("Enter a number");
			current=in.nextInt();
			int x=current;
			 a[i]=current;
			sum=sum+x;
		}
		System.out.println(sum);
		average= sum/total;
		System.out.println(average);
		int x=0;
		while(x<total) {
			if (a[x]>average)
				System.out.println(a[x]);
			
		}
		
	}

}
