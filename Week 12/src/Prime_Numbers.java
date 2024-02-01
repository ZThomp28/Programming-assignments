import java.util.*;
public class Prime_Numbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int end=in.nextInt();
		in.close();
		System.out.println("The prime numbers");
		for (int i = 1;i<=end;i++) {
			if(isprime(i)==true)
			System.out.println(i);
		}

	}
	
	public static boolean isprime(int x){
		if (x==1||x==2||x==3||x==5)
			return true;
		else if(x%2!=0&&x%3!=0&&x%5!=0)
			return true;
		else
			return false;
	}

}
