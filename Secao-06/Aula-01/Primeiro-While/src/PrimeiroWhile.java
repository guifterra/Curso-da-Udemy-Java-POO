/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Aula 01: Estrutura de repetição While
 *  
 *  - Lendo multiplos valores até inserir o valor 0
 *  
 */

import java.util.Scanner;

public class PrimeiroWhile {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração e inicialização da var número
		int numero = 1;
		
		// Repete enquanto o usuário não inserir 0
		while(numero != 0) {
			
			System.out.print("\n Entre com um numero: ");
			numero = leia.nextInt();
			
		}
		
		System.out.print("\n Vc digitou 0! \n Fim do programa . . . \n");

	}

}
