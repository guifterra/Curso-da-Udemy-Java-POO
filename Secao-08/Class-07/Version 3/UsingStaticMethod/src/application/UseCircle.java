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
		
		System.out.print("\n Enter radius: ");
		double radius = sc.nextDouble();
		
		System.out.printf("\n Circunference: %.2f ", Calculator.circunference(radius));
		System.out.printf("\n Volume.......: %.2f ", Calculator.volume(radius));
		System.out.printf("\n PI Value.....: %.2f ", Calculator.PI);
		
		sc.close();
	}
}
