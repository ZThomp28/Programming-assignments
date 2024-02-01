import java.util.*;
public class TemperatureAnalyzer {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		TemperatureDataSet year= new TemperatureDataSet();
		
		for (int i=0;i<12;i++) {
			System.out.println("Enter a temperature (in fahrenheit)");
			year.add(i, in.nextDouble());
		}
		System.out.println("Chose a month number from 0-11");
		int current=in.nextInt();
		// could've used a separate method
		ArrayList<String> coldm = new ArrayList<String>();
		ArrayList<Double> coldtemp = new ArrayList<Double>();
		ArrayList<String> coolm = new ArrayList<String>();
		ArrayList<Double> cooltemp = new ArrayList<Double>();
		ArrayList<String> warmm = new ArrayList<String>();
		ArrayList<Double> warmtemp = new ArrayList<Double>();
		ArrayList<String> hotm = new ArrayList<String>();
		ArrayList<Double> hottemp = new ArrayList<Double>();
		
		for(int i=0;i<12;i++){
			if (year.getTemperature(i)<60) {
				coldm.add(year.getNameOfMonth(i));
				coldtemp.add(year.getTemperature(i));
			}
			else if (year.getTemperature(i)<72) {
				coolm.add(year.getNameOfMonth(i));
				cooltemp.add(year.getTemperature(i));
			}
			else if (year.getTemperature(i)<85) {
				warmm.add(year.getNameOfMonth(i));
				warmtemp.add(year.getTemperature(i));
			}
			else {
				hotm.add(year.getNameOfMonth(i));
				hottemp.add(year.getTemperature(i));
			}
		}
		double coldsum=0;
		for(int i=0;i<coldtemp.size();i++){
			coldsum=coldsum+coldtemp.get(i);
		}
		double coldavg=coldsum/coldtemp.size();
		
		double coolsum=0;
		for(int i=0;i<cooltemp.size();i++){
			coolsum=coolsum+cooltemp.get(i);
		}
		double coolavg=coolsum/cooltemp.size();
		
		double warmsum=0;
		for(int i=0;i<warmtemp.size();i++){
			warmsum=warmsum+warmtemp.get(i);
		}
		double warmavg=warmsum/warmtemp.size();
		
		double hotsum=0;
		for(int i=0;i<hottemp.size();i++){
			hotsum=hotsum+hottemp.get(i);
		}
		double hotavg=hotsum/hottemp.size();
		
		for(int i=0;i<coldm.size();i++) {
			System.out.println("The "+(i+1)+" cold month is "+coldm.get(i));
			}
		for(int i=0;i<coolm.size();i++) {
			System.out.println("The "+(i+1)+" cool month is "+coolm.get(i));}
		for(int i=0;i<warmm.size();i++) {
			System.out.println("The "+(i+1)+" warm month is "+warmm.get(i));}
		for(int i=0;i<hotm.size();i++) {
			System.out.println("The "+(i+1)+" hot month is "+hotm.get(i));}
		System.out.println("The average for the cold months is "+coldavg);
		System.out.println("The average for the cool months is "+coolavg);
		System.out.println("The average for the warm months is "+warmavg);
		System.out.println("The average for the hot months is "+hotavg);
		
		System.out.println("The month you picked is "+year.getNameOfMonth(current)+". The temperature is "+year.getTemperature(current));
		System.out.println("The sum of the temperatures are "+year.getSum());
		System.out.println("The years average tempearture is "+year.getAverage());
		System.out.println("The month with the highest temperature is "+year.getMonthOfMaximum()+" and its temperature is "+year.getMaximum());
		System.out.println("The month with the lowest temperature is "+year.getMonthOfMinimum()+" and its temperature is "+year.getMinimum());
		in.close();
	}

}
