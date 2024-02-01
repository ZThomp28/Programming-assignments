import java.util.*;
public class Full_Pryimid_Count_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How Many Rows You Want In Your Pyramid?");
		 
        int noOfRows = sc.nextInt();
        sc.close();
 
        System.out.println("Here Is Your Pyramid");
 
        for (int i = noOfRows; i >= 1; i--)
        { 
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }

            for (int j = i; j <= noOfRows; j++)          
            {
                System.out.print(j+" ");
            }
            for (int j = noOfRows-1; j >= i; j--)
            {               
                System.out.print(j+" ");            
            }

            System.out.println();
            

        }

	}
}
