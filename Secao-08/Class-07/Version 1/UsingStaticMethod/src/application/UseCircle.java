/*
 *  Author: Guilherme Fabiano Terra
 *  S8 - Class 07: Creating a static method
 *  
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class UseCircle {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		System.out.print("\n Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circunference(radius);
		double v = volume(radius);
		
		System.out.printf("\n Circunference: %.2f ", c);
		System.out.printf("\n Volume.......: %.2f ", v);
		System.out.printf("\n PI Value.....: %.2f ", PI);
		
		sc.close();
	}
	
	public static double circunference(double radius){
		
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius){
		
		return 4 * PI * (Math.pow(radius, 3) / 3);
	}
}
