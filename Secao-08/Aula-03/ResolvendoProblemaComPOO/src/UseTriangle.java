/*
 *  Autor: Guilherme Fabiano Terra
 *  S8 - Aula 03: Comparando área de 2 triângulos com POO
 *  
 *  + Metodo para calculo da área
 *  
 */

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class UseTriangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner( System.in );
		
		Triangle x,y;
		
		// Criando ou Instanciando os Objetos
		x = new Triangle();
		y = new Triangle();
		
		System.out.print("\n  Enter the measures of triangle X: \n");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		
		System.out.print("\n  Enter the measures of triangle Y: \n");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();
				
		double areaX = x.area(); 
		double areaY = y.area();
		
		System.out.printf("\n Triangle X area: %.4f", areaX);
		System.out.printf("\n Triangle Y area: %.4f", areaY);
		
		if(areaX > areaY) {
			System.out.print("\n Larger area: X \n");
		}else {
			System.out.print("\n Larger area: Y \n");
		}
	}

}
