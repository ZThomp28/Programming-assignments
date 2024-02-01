
public class GetTeenString {

	public static void main(String[] args) {
		
		System.out.println(getTeenString(5, 8, 9));
		System.out.println(getTeenString(11, 14, 7));
		System.out.println(getTeenString(13, 15, 6));
		
	}
		public static String getTeenString(int a, int b, int c){
			  if (a>=13 && a<=19)
			    if (b>=13 && b<=19)
			      if (c>=13 && c<=19)
			        return "ThreeTeen";
			      else 
			        return "TwoTeen";
			    else if (c>=13 && c<=19)
			      return "TwoTeen";
			    else 
			    return "OneTeen";
			  else if (b>=13 && b<=19)
			    if (c>=13 && c<=19)
			      return "TwoTeen";
			    else
			    return "OneTeen";
			  else
			  return "NoTeen";

	}

}
