package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		System.out.print("\n How many heights do you want to add? : ");
		int qtHeights = sc.nextInt();
		
		double vector[] = new double[qtHeights];
		
		double sum = 0.0;
		for(int index = 0; index < vector.length; index++) {
			
			System.out.printf("\n >> Height %d: ", index + 1);
			vector[index] = sc.nextDouble();
			sum += vector[index];
		}
		
		System.out.print("\n Average height: " + String.format("%.2f", (sum / vector.length)));
		sc.close();
	}

}
