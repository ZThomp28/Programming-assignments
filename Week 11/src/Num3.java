
public class Num3 {

	public static void main(String[] args) {
		int sum=0;
		int x=99;
		for (int i=1;i<100;i++) {
			sum = sum +(x*i);
			x=x-1;
		}
		System.out.println(sum);
	}

}
