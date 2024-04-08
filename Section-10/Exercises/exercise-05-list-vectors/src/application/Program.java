package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault( Locale.US );
		Scanner sc = new Scanner( System.in );
		
		System.out.print("\n How many numbers do you want to enter? : ");
		int qtNumbers = sc.nextInt();
		
		double[] numbers = new double[qtNumbers];
		
		for(int index = 0; index < numbers.length; index++) {
			
			System.out.print(" Enter a number: ");
			numbers[index] = sc.nextDouble();
		}
		
		double higherNumber = numbers[0];
		int indexHN = 0;
		
		for(int index = 1; index < numbers.length; index++) {
			
			if( higherNumber < numbers[index] ) {
				higherNumber = numbers[index];
				indexHN = index;
			}
		}
		
		System.out.printf("\n Higher value: %.2f ", higherNumber);
		System.out.printf("\n index of HV.: %d ", indexHN);
	}

}
