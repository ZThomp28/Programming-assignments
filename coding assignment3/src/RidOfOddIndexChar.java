
public class RidOfOddIndexChar {

	public static void main(String[] args) {
		System.out.println(getRidOfOddIndexChar("javascript"));
		System.out.println(getRidOfOddIndexChar("code"));
		System.out.println(getRidOfOddIndexChar("pizza"));
	}
	public static String getRidOfOddIndexChar( String str) {
		  String even="";
		  for (int i=0;i<str.length();i=i+2){
		    even = even+str.charAt(i);
		  }
		  return even;
		}
}
