
public class Getmaxamongthree {

	public static void main(String[] args) {
		int r1, r2, r3;
		
		r1=getMaximumAmongThree(1, 2, 3);
		r2=getMaximumAmongThree(10, 8, 6);
		r3=getMaximumAmongThree(-1, 9, 7);
	
	System.out.println(r1);	
	System.out.println(r2);			
	System.out.println(r3);	
	}	
	public static int getMaximumAmongThree(int a, int b, int c)
		{
			  if (a>=b && a>=c)
			    return a;
			  else if (b>=a & b>=c)
			     return b;
			  else 
			    return c;
			

	}

}
