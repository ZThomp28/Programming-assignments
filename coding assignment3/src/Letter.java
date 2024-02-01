
public class Letter {

	public static void main(String[] args) {
		System.out.println(getLetter('a'));
		System.out.println(getLetter('b'));
		System.out.println(getLetter('c'));

	}
	public static int getLetter( char myChar ) {
		  if (myChar=='a')
		    return 1;
		  if (myChar=='b')
		    return 2;
		  if (myChar=='c')
		    return 3;
		  if (myChar=='d')
		    return 4;
		  else
		    return 5;
		}

}
