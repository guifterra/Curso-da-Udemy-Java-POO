package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		int qtNumbers;
		
		do{
			System.out.print("\n How many numbers do you want to enter? : ");
			qtNumbers = sc.nextInt();
			
		}while(!(qtNumbers >= 0 && qtNumbers <= 10));
		
		int[] vect = new int[qtNumbers];
		
		for(int index = 0; index < vect.length; index++) {
			
			System.out.print(" Enter a number: ");
			vect[index] = sc.nextInt();
		}
		
		System.out.printf("\n Negative numbers: [%s]", getNegativeNumbers(vect));
	}
	
	static String getNegativeNumbers(int[] vect) {
		
		if(vect.length == 0)
			return "";
		
		String negatives = " ";
		
		for(int value : vect) {
			
			if( value < 0 )
				negatives += value + " ";
		}
		
		return negatives;
	}

}
