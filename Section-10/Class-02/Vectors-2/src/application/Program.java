package application;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault( Locale.US );
		Scanner sc = new Scanner( System.in );
		Scanner scStr = new Scanner( System.in );
		
		System.out.print("\n How many products do you want to add? : ");
		int qtProducts = sc.nextInt();
		
		Product[] products = new Product[qtProducts];
		double sumPrice = 0;
		
		for( int index = 0; index < products.length; index++) {
			
			products[index] = new Product();
			
			System.out.printf("\n Product %d - Name.: ", (index + 1));
			products[index].setName(scStr.nextLine());
			
			System.out.printf(" Product %d - Value: ", (index + 1));
			products[index].setValue(sc.nextDouble());
			
			sumPrice += products[index].getValue(); 
		}
		
		System.out.printf("\n Average price: %.2f", ( sumPrice / products.length ));
		
		sc.close();
	}

}
