/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - 02: processamento
 *  
 */

public class Main {

	public static void main(String[] args) {
		
		// Usando processamento de operação arit
		int    x;
		double y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println("\n - x: " + x);
		System.out.println("\n - y: " + y);

		// Calculando área de trapézio
		double baseMenor, baseMaior, altura, area;
		
		baseMenor = 6.0;
		baseMaior = 8.0;
		altura    = 5.0;
		
		area = (baseMenor + baseMaior) / 2.0 * altura;
		
		System.out.printf("\n A area do trapezio eh: %.2f", area);
		
		// Divisão simples
		int    valor1,
		       valor2;
		
		double resultado;
		
		valor1 = 5;
		valor2 = 2;
		
		// Realizando Casting
		resultado = (double) valor1 / valor2;
		
		System.out.printf("\n\n Resultado da divisao eh: %.2f \n", resultado);
	}

}
