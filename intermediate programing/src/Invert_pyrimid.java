import java.util.*;
public class Invert_pyrimid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many rows do you want");
		int rows=in.nextInt();
		in.close();
		 for (int i = 1; i <= rows; i++) {
             for (int j = 1; j <= (rows - i)*2; j++) //create initial spacing.
                   System.out.print("  ");
             
             for (int k = i; k >= 1; k--) //creates left half.
            	 if(k<10)
             	 	System.out.print("  "+k);
                    else
                 	   System.out.print(" "+k);
             
             for (int k = 2; k <= i; k++)//creates right half.
                   if(k<10)
            	 	System.out.print("  "+k);
                   else
                	   System.out.print(" "+k);
             System.out.println();
      }
	}

}
