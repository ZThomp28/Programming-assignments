
public class Vowels {

	public static void main(String[] args) {
		System.out.println(changeVowels("hello"));
		System.out.println(changeVowels("Oh my gosh"));
		System.out.println(changeVowels("bird bird bird bird is the word"));

	}
	public static String changeVowels( String str) {
		  char[] a=new char[str.length()];
		  String x="";
		  for (int i = 0; i < str.length(); i++) {
		    a[i]=str.charAt(i);
		    if (a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='O') {
		      a[i]='x';}
		    x=x+a[i];
		  }
		  return x;
		}
}
