/*
 *  Author: Guilherme Fabiano Terra
 *  S8 - Class 08: Bought dollar
 *  
 *  Note: 6% tax on financial transactions
 *  
 */

package application;

import java.util.Locale;
import java.util.Scanner;
import util.*;

public class BoughtDollar_Reals {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		System.out.print("\n What's the dollar price? : ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("\n How many dollars will be bought? : ");
		double quantity = sc.nextDouble();
		
		System.out.printf("\n Amount to be paid in real: R$ %.2f \n", CurrencyConverter.identifyTheAmountInReals(dollarPrice, quantity));
	}

}
