/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Aula 01: Estrutura de repeti��o While
 *  
 *  - Lendo multiplos valores at� inserir o valor 0
 *  
 */

import java.util.Scanner;

public class PrimeiroWhile {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o e inicializa��o da var n�mero
		int numero = 1;
		
		// Repete enquanto o usu�rio n�o inserir 0
		while(numero != 0) {
			
			System.out.print("\n Entre com um numero: ");
			numero = leia.nextInt();
			
		}
		
		System.out.print("\n Vc digitou 0! \n Fim do programa . . . \n");

	}

}
