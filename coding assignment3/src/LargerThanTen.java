
public class LargerThanTen {

	public static void main(String[] args) {
		System.out.println(isLargerThanTen(10));
		System.out.println(isLargerThanTen(9));
		System.out.println(isLargerThanTen(8));
	}
	
	public static boolean isLargerThanTen(int x) {
		  if (x>=10)
		    return true;
		  else 
		    return false;
		}

}
