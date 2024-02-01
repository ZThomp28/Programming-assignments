
public class test {

	public static void main(String[] args) {
		short w=6;
		short h;
		do {
			System.out.print(w+"-");
			w--;
		}while(w>4);
		for(h=w;h<7;h++) {
			System.out.print(h+"#");
		}
		System.out.println("\n"+w+"-");
		System.out.println(h+"-");
	}
}


