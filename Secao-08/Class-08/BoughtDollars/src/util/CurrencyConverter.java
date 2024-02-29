package util;

public class CurrencyConverter {
	
	public static double tax = 0.06;
	
	public static double identifyTheAmountInReals(double dollarPrice, double quantity) {
		return ((quantity + (quantity * tax)) * dollarPrice);
	}
}
