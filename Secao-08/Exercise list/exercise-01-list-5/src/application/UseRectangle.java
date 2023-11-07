/*
 *  Author: Guilherme Fabiano Terra
 *   
 */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class UseRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("\nEnter rectangle width and height: \n");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("\n AREA.....: %.2f",rectangle.area());
		System.out.printf("\n PERIMETER: %.2f",rectangle.perimeter());
		System.out.printf("\n DIAGONAL.: %.2f \n",rectangle.diagonal());
	}

}
