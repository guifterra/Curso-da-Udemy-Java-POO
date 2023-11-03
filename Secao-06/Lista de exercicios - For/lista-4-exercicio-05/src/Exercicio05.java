/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 05
 *  
 *  Enunciado:
 *  
 *  Ler um valor N. Calcular e escrever seu respectivo fatorial.
 *  Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 *  Lembrando que, por definição, fatorial de 0 é 1.
 *  
 */

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declaração e leitura do numero
		System.out.print("\n Digite o numero: ");
		int numero = leia.nextInt();
		
		// Declaração do fatorial
		int fatorial = 1;
		
		// Calculando fatorial
		for(int i = 1; i <= numero; i++) {
			
			fatorial *= i;
		}
		
		// Impressao do fatorial
		System.out.printf("\n O fatorial de %d eh: %d \n", numero, fatorial);

	}

}
