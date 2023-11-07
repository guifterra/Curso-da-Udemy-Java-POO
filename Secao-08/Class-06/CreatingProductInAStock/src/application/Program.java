/*
 *  Author: Guilherme Fabiano Terra
 *  S8 - Class 04: Creating product in a Stock
 *  
 */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		Product product = new Product();
		
		System.out.print("\n Enter product data: \n");
		System.out.print("\n Name....: ");
		product.name = sc.nextLine();
		System.out.print("\n Price...: ");
		product.price = sc.nextDouble();
		System.out.print("\n Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.print("\n\n -> Product data: " + product);
		
		System.out.print("\n\n Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.print("\n\n -> Product data: " + product);
		
		System.out.print("\n\n Enter the number of products to be removed in stock: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println("\n\n -> Product data: " + product);
		
		sc.close();

	}

}
