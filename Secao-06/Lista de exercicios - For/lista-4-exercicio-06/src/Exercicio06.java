/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 06
 *  
 *  Enunciado:
 *  
 *  Ler um n�mero inteiro N e calcular todos os seus divisores.
 *  
 */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declara��o e leitura do numero
		System.out.print("\n Digite um numero: ");
		int numero = leia.nextInt();
		
		// identifica��o dos divisores
		System.out.print("\n - - -> DIVISORES: \n");
		for(int aux = numero; aux >= 1; aux--) {
			
			// Verifica se � divisor
			if(numero % aux == 0) {
				
				System.out.println(" Divisor: " + aux);
			}
			
		}

	}

}
