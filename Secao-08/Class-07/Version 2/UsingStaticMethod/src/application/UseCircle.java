/*
 *  Author: Guilherme Fabiano Terra
 *  S8 - Class 07: Creating a static method
 *  
 */

package application;

import java.util.Locale;
import java.util.Scanner;
import util.*;

public class UseCircle {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		Calculator calc = new Calculator();
		
		System.out.print("\n Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circunference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("\n Circunference: %.2f ", c);
		System.out.printf("\n Volume.......: %.2f ", v);
		System.out.printf("\n PI Value.....: %.2f ", calc.PI);
		
		sc.close();
	}
}
