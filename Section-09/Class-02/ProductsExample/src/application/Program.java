package application;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault( Locale.US );
		Scanner sc = new Scanner( System.in );
		
		System.out.println(" - - -> Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product( name , price );
		
		System.out.println("\n - - -> Product data: " + product);
		
		System.out.print("\n Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println("\n - - -> Updated data: " + product);
		
		System.out.print("\n Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println("\n - - -> Updated data: " + product);
	}

}
