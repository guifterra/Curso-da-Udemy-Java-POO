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
		
		System.out.printf("\n Vector average: %.3f", average(numbers));
		System.out.printf("\n Elements under average: \n [%s] ", 
		underAverage(numbers, average(numbers)));
	}
	
	static double average( double[] numbers ) {
		
		double sum = 0.0;
		
		for(double value : numbers)
			sum += value;
		
		return sum / (numbers.length);
	}
	
	static String underAverage( double[] numbers , double average ) {
		
		String underNumbers = "";
		
		for(double value : numbers)
			if(value < average) {
				
				underNumbers += " " + String.format("%.1f", value) + " ";
			}
				
		return underNumbers;
	}

}
