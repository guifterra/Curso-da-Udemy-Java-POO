/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 06
 *  
 *  Enunciado:
 *  
 *  Ler um número inteiro N e calcular todos os seus divisores.
 *  
 */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declaração e leitura do numero
		System.out.print("\n Digite um numero: ");
		int numero = leia.nextInt();
		
		// identificação dos divisores
		System.out.print("\n - - -> DIVISORES: \n");
		for(int aux = numero; aux >= 1; aux--) {
			
			// Verifica se é divisor
			if(numero % aux == 0) {
				
				System.out.println(" Divisor: " + aux);
			}
			
		}

	}

}
