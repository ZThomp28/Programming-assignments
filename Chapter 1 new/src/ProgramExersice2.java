
public class ProgramExersice2 {

	public static void main(String[] args) {
		int shares = 600;
		double stockprice = 21.77;
		double broker = 0.02;
		double stockalone;
		double comission;
		double total;
		
		stockalone = shares*stockprice;
		comission = stockalone*broker;
		total =stockalone+comission;
		
			System.out.println("Without comission stock price is $" + stockalone);
			System.out.println("The comission was $" + comission);
			System.out.println("The toatal amout paid is $"+ total);

	}

}
