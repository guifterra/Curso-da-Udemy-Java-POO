package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		int qtNumbers;
		do{
			System.out.print("\n How many number do you want to enter? : ");
			qtNumbers = sc.nextInt();
			
		}while(!(qtNumbers >= 0));
		
		double[] vector = new double[qtNumbers];
		for(int index = 0; index < vector.length; index++) {
			
			System.out.print(" Enter a number: ");
			vector[index] = sc.nextDouble();
		}
		
		System.out.printf("\n Values: [%s]", showVector(vector));
		System.out.printf("\n Soma...: %.2f", sumVector(vector));
		System.out.printf("\n Average: %.2f", averageVector(vector));
	}
	
	static String showVector(double[] vect) {
		
		String numbers = "";
		
		for(double value : vect)
			numbers += " " + value + " ";
		
		return numbers;
	}
	
	static double sumVector(double[] vect) {
		
		double sum = 0.0;
		
		for(double value : vect)
			sum += value;
		
		return sum;
	}
	
	static double averageVector(double[] vect) {
		
		return (sumVector(vect) / vect.length);
	}

}
