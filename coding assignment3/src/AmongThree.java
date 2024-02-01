
public class AmongThree {

	public static void main(String[] args) {
	System.out.println(greatestAmongThree(1, 2, 3));
	System.out.println(greatestAmongThree(2, 3, 4));
	System.out.println(greatestAmongThree(4, 5, 6));

	}
	public static int greatestAmongThree(int x, int y, int z) {
	    if (x>y && x>z)
	    return x;
	  else if (y>x && y>z)
	      return y;
	  else 
	    return z;
	}
}
