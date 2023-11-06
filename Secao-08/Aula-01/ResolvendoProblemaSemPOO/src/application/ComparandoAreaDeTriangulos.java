/*
 *  Autor: Guilherme Fabiano Terra
 *  S8 - Aula 01: Comparando área de 2 triângulos sem POO
 *  
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class ComparandoAreaDeTriangulos {

	public static void main(String[] args) {
		
		// Define . como separador decimal
		Locale.setDefault(Locale.US);
		
		// Declaração do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Lendo valores do Triangulo X
		System.out.print("\n Entre com os lados do Triang X: ");
		double xA = leia.nextDouble();
		double xB = leia.nextDouble();
		double xC = leia.nextDouble();
		
		// Lendo valores do Triangulo Y
		System.out.print("\n Entre com os lados do Triang Y: ");
		double yA = leia.nextDouble();
		double yB = leia.nextDouble();
		double yC = leia.nextDouble();
		
		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("\n Area do triangulo X: %.4f", areaX);
		System.out.printf("\n Area do triangulo Y: %.4f \n", areaY);
		
		if(areaX > areaY) {
			
			System.out.print("\n Maior area: X");
			
		}else {
			
			System.out.print("\n Maior area: Y");
		}
	}

}
