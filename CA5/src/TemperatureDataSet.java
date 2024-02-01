
public class TemperatureDataSet {
	private double[] tempData = new double[12];
	private String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	
	public void add(int i, double temperature) {
		if (i<12&&i>=0)
			tempData[i]=temperature;
	}
	public String getNameOfMonth(int i) {
		return month[i];
	}
	public double getTemperature(int i) {
		return tempData[i];
	}
	public double getSum() {
		double sum=0;
		for (int i=0;i<tempData.length;i++) {
			sum=sum+tempData[i];
		}
		return sum;
	}
	public double getAverage() {
		double sum=0;
		for (int i=0;i<tempData.length;i++) {
			sum=sum+tempData[i];
		}
		double avg=sum/12;
		return avg;
	}
	public double getMaximum() {
		double max =tempData[0];
		for (int i=0;i<tempData.length;i++) {
			if(max<tempData[i])
				max=tempData[i];
		}
		return max;
	}
	public double getMinimum() {
		double min =tempData[0];
		for (int i=0;i<tempData.length;i++) {
			if(min>tempData[i])
				min=tempData[i];
		}
		return min;
	}
	public String getMonthOfMaximum() {
		double maxtemp =tempData[0];
		String maxmonth=month[0];
		for (int i=0;i<tempData.length;i++) {
			if(maxtemp<tempData[i]) {
				maxtemp=tempData[i];
				maxmonth=month[i];}
		}
		return maxmonth;
	}
	public String getMonthOfMinimum() {
		double min =tempData[0];
		String minmonth=month[0];
		for (int i=0;i<tempData.length;i++) {
			if(min>tempData[i]) {
				min=tempData[i];
				minmonth=month[i];}
		}
		return minmonth;
	}
}
