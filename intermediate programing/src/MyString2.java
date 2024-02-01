
public class MyString2 {

	private String s;

	public MyString2(String s) {
		this.s = "";
		for (int i = 0; i < s.length(); i++) {
			this.s += s.charAt(i) + "";
		}
	}

	public int compare(String s) {
		int index = 0;
		if (this.s.length() < s.length())
			index = -1;
		if (s.length() < this.s.length())
			index = 1; 


		for (int i = 0; i < this.s.length(); i++) {
			if (this.s.charAt(i) < s.charAt(i))
				index = -(i + 1);
			if (this.s.charAt(i) > s.charAt(i))
				index = i + 1;
		}
		return index;
	}

	public MyString2 substring(int begin) {
		String b = "";
		for (int i = begin; i < s.length(); i++) {
			b += s.charAt(i) + "";
		}
		return new MyString2(b);
	}
	public MyString2 toUpperCase() {
		String n = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				n += String.valueOf((char)(s.charAt(i) - 32));
			else
				n += String.valueOf(s.charAt(i));
		}
		return new MyString2(n);
	}

	public char[] toChars() {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}

	public static MyString2 valueOf(boolean b) {
		return (b ? new MyString2("true") : new MyString2("false"));
	}
	public static void split(String s, String regex) {
		String []temp;
		temp=s.split(regex);
		for(int i = 0;i<temp.length;i++)
		{


		    if(i == 0){
		        System.out.printf("[");
		    }

		    System.out.printf(temp[i]);

		    if(i != temp.length - 1){
		    System.out.printf(", " + regex + ", ");
		    }
		    if(i == temp.length - 1){
		        System.out.printf("]");

		    }

		}
	}
}
