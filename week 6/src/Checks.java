import java.util.Scanner;
public class Checks {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("How many checks were deposited");
		
		double checks, fee;
		
		checks= num.nextDouble();
		num.close();
		
		if (checks<20 && checks>=0)
			{fee = checks*0.10+10; System.out.println("Your fee is $"+ fee);}
		else if (checks <40)
			{fee = checks*0.08+10; System.out.println("Your fee is $"+ fee);}
		else if (checks <60)
			{fee = checks*0.06+10; System.out.println("Your fee is $"+ fee);}
		else
			{fee = checks*0.04+10; System.out.println("Your fee is $"+ fee);}
					
	}

}
