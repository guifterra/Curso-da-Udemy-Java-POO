package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print("\n How many numbers do you want to enter? : ");
		int qtNumbers = sc.nextInt();
		
		int[] numbers = new int[qtNumbers];
		
		for(int index = 0; index < numbers.length; index++) {
			
			System.out.print(" Enter a number: ");
			numbers[index] = sc.nextInt();
		}
		
		int qtPairs = 0;
		System.out.print("\n >>> Pair numbers: \n");
		for(int index = 0; index < numbers.length; index++) {
			
			if( numbers[index] % 2 == 0 ) {
				System.out.print(" " + numbers[index]);
				qtPairs++;
			}
		}
		System.out.println("\n\n Quantity pairs: " + qtPairs);
	}

}
