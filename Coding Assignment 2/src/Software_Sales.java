import java.util.Scanner;
public class Software_Sales {

	public static void main(String[] args) {
		Scanner pack = new Scanner(System.in);
		System.out.println("How many packages did you order");
		
		double packagenum, packageprice, base, discount;
		
		packagenum = pack.nextDouble();
		base = 69.00;
		discount = getDiscount(packagenum);
		packageprice= packagenum*base;
		double totalprice = packageprice - (packageprice*discount);
			
		System.out.println("Your total is $"+totalprice);
		System.out.println("Your discount was "+discount*100 +"%");
		
		pack.close();
	}
		public static double getDiscount(double num){
		if (num >= 5 && num <=14)
			return 0.10;
		else if (num<=34)
			return 0.20;
		else if (num <=54)
			return 0.30;
		else if (num>=55)
			return 0.40;
		else
			return 0;
			
	}

}
