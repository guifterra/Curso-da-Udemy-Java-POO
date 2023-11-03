/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 01
 *  
 *  Enunciado:
 *  
 *  Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre
 *  os ímpares de 1 até X, um valor por linha, inclusive o X,
 *  se for o caso.
 *  
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// Declaração de Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração do limite
		int numeroLimite = 1;
		
		// Obriga valor de 1 a 100
		do {
			
			// Leitura do limite
			System.out.print("\n Entre com o valor limite: ");
			numeroLimite = leia.nextInt();
			
		}while(!((numeroLimite >= 1) && (numeroLimite <= 100)));
		
		System.out.printf("\n - - -> IMPARES NO INTERVALO [ 1 a %d ] : \n", numeroLimite);
		for(int i = 1; i <= numeroLimite; i++) {
			// Verifica se é impar
			if(i % 2 != 0) {
				
				// Imprime i
				System.out.println(i);
			}
		}
		System.out.println("\n");
	}

}
