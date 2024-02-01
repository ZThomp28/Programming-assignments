import java.util.*;
public class Side_pyrimid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many rows do you want");
		int total=in.nextInt();
		in.close();
		for(int i=1;i<=total;i++) {
			for(int y=total-i;y>0;y--) {
				System.out.print("   ");
			}
			for(int x=i;x>0;x--) {	
				if(x<10)	
					System.out.print("  "+x);
				else
					System.out.print(" "+x);
			}
			System.out.println();
		}


	}

}
