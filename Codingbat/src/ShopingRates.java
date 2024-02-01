
public class ShopingRates {

	public static void main(String[] args) {
		
	System.out.println(getShippingCharge(1));	
	System.out.println(getShippingCharge(5));	
	System.out.println(getShippingCharge(9));
	System.out.println(getShippingCharge(11));
	}
		public static double getShippingCharge(double weight){
			  if (weight<2)
			    return 1.1;
			  else if (weight<6)
			    return 2.2;
			  else if (weight<10)
			    return 3.7;
			  else
			    return 3.8;
			


	}

}
