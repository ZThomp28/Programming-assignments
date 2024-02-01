
public class Stockc {

	String symbol;                 
	String name;                   
	double previousClosingPrice;	 
	double currentPrice;				 
	
	 Stockc(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}

	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / 
					previousClosingPrice) * 100;
	}
}

