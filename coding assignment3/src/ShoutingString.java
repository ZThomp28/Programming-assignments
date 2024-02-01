
public class ShoutingString {

	public static void main(String[] args) {
		System.out.println(getShoutingString("Sparta", 5));
		System.out.println(getShoutingString("Gonna", 3));
		System.out.println(getShoutingString("Ya", 10) );

	}
	public static String getShoutingString(String str, int num) {
		  for (int i=0;i<num;i++){
		    str = str +"a";
		  }
		  return str;
		}
}
