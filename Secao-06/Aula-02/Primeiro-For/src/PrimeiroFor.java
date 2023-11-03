/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Aula 02: Estrutura de repetição For
 *  
 *  - Somando N valores
 *  
 */

import java.util.Scanner;

public class PrimeiroFor {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração de quantidadeDeVezes e soma
		int quantidadeDeVezes, numero, soma = 0;
		
		// Lendo quantos numeros serão lidos
		System.out.print("\n Entre com a quantidade de numeros que deseja ler: ");
		quantidadeDeVezes = leia.nextInt();
		
		// Lendo os numeros da soma
		for(int quantidadeLida = 0; quantidadeLida < quantidadeDeVezes; quantidadeLida++) {
			
			// Leitura de numero
			System.out.print("\n Entre com um numero: ");
			numero = leia.nextInt();
			
			// Soma
			soma += numero;
		}
		
		// Impressao da soma dos N numeros
		System.out.printf("\n A soma dos %d numeros inseridos e: %d \n", quantidadeDeVezes, soma);

	}
}