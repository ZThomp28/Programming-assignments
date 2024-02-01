
public class Fahrenheit {

	public static void main(String[] args) {
		System.out.println(getFahrenheit(30));
		System.out.println(getFahrenheit(0));
		System.out.println(getFahrenheit(20));

	}
	public static double getFahrenheit( double celsius ) {
		  double f = (9.0/5) * (celsius) + 32;
		  return f;
		}
}
