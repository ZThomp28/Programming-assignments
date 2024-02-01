import java.util.Scanner;
public class Number_of_Days_in_a_Month {

	public static void main(String[] args) {
		 Scanner mon = new Scanner(System.in);
		 System.out.println("Enter a number 1-12");
		 
		 // each month is given a number january = 1 and so on
		 
		 int month = mon.nextInt();
		 mon.close();
		 
		 System.out.println(getDays(month));
	}
		 public static int getDays(int num){
		 if(num == 2)return 28;
		    if( ((num % 2) != 0 && num < 9) || ((num % 2 == 0) && num >= 8))
		    	return 31;
		    else
		    	return 30;
	}

}
