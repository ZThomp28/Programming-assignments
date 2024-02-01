
public class HumidityChar {

	public static void main(String[] args) {
		System.out.println(getHumidityChar(true,90));

	}
	public static char getHumidityChar( boolean isRaining, int humidity) {
		  if (isRaining==true||humidity>=80)
		    return 'h';
		  else 
		    return 'x';
		}

}
