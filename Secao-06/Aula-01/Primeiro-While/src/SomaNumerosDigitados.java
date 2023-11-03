/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Aula 01: Estrutura de repetição While
 *  
 *  - Somando multiplos valores até inserir o valor 0
 *  
 */

import java.util.Scanner;

public class SomaNumerosDigitados {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração e inicialização de numero e soma
		int numero = 1, soma = 0;
		
		// Realiza leitura e soma, enquanto numero != 0
		while(numero != 0) {
			
			// Leitura de numeros
			System.out.print("\n Entre com um numero: ");
			numero = leia.nextInt();
			
			// Soma
			soma += numero;
			
		}
		
		// Imprime a soma para o usuário
		System.out.print("\n A soma dos numeros inseridos e: " + soma);
	}

}
