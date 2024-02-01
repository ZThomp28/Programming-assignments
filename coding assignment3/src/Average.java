
public class Average {

	public static void main(String[] args) {
		System.out.println(getAverage(1, 2, 3));
		System.out.println(getAverage(3, 4, 5));
		System.out.println(getAverage(4, 5, 7));	
	}
	
	public static int getAverage(int first, int second, int third) {
		  int sum =first+second+third;
		  int average=sum/3;
		  return average;
		}

}
