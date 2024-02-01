import java.util.*;
class Power {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
    int base = 3, powerRaised = in.nextInt();
    int result = power(base, powerRaised);

    System.out.println(base + "^" + powerRaised + "=" + result);
  }

  public static int power(int base, int powerRaised) {
    if (powerRaised != 0) {

      // recursive call to power()
      return (base * power(base, powerRaised - 1));
    }
    else {
      return 1;
    }
  }
}