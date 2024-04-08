package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault( Locale.US );
		Scanner sc = new Scanner( System.in );
		
		System.out.print("\n How many elements will the vector have? : ");
		int qtElements = sc.nextInt();
		
		double[] numbers = new double[qtElements];
		
		for(int index = 0; index < numbers.length; index++) {
			
			System.out.print(" Enter a number: ");
			numbers[index] = sc.nextDouble();
		}
		
		System.out.printf("\n Pairs average: %s", averagePairs(numbers));
	}
	
	static String averagePairs( double[] numbers ) {
		
		double sum = 0.0;
		int qtPairs = 0;
		
		for(double value : numbers)
			if( value % 2 == 0 ) {	
				sum += value;
				qtPairs++;
			}
		
		if( qtPairs != 0 )
			return String.format("%.1f", (sum / qtPairs));
		
		return "No even numbers";
	}
}
