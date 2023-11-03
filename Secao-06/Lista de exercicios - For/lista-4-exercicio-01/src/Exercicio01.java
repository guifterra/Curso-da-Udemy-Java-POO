/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 01
 *  
 *  Enunciado:
 *  
 *  Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre
 *  os �mpares de 1 at� X, um valor por linha, inclusive o X,
 *  se for o caso.
 *  
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// Declara��o de Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o do limite
		int numeroLimite = 1;
		
		// Obriga valor de 1 a 100
		do {
			
			// Leitura do limite
			System.out.print("\n Entre com o valor limite: ");
			numeroLimite = leia.nextInt();
			
		}while(!((numeroLimite >= 1) && (numeroLimite <= 100)));
		
		System.out.printf("\n - - -> IMPARES NO INTERVALO [ 1 a %d ] : \n", numeroLimite);
		for(int i = 1; i <= numeroLimite; i++) {
			// Verifica se � impar
			if(i % 2 != 0) {
				
				// Imprime i
				System.out.println(i);
			}
		}
		System.out.println("\n");
	}

}
