/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Aula 03: Estrutura de repetição DoWhile
 *  
 *  - Criando um programa que converte a escala Celsius para 
 *  a escala Fahrenheit, enquanto o usuário desejar continuar
 *  
 */

import java.util.Scanner;

public class CelsiusParaFahr {

	public static void main(String[] args) {
		
		// Declação do Scanner de numeros e de Strings
		Scanner leia = new Scanner ( System.in );
		Scanner leiaStr = new Scanner ( System.in );
		
		// Declaração das variáveis
		double celsius, fahrenheit;
		String encerrarPrograma = "N";
		
		do {
			// Leitura da temperatura em Celsius
			System.out.print("\n Digite a temperatura em Celsius: ");
			celsius = leia.nextDouble();
			
			// Calculo da temperatura em Fahrenheit
			fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			
			// Impressao da temperatura em °F
			System.out.printf("\n Temperatura em Fahrenheit: %.1f \n", fahrenheit);
			
			// Leitura da decisão do usuário
			System.out.print("\n Deseja encerrar o programa(s/n)? : ");
			encerrarPrograma = leiaStr.nextLine();
			
		// Verifica se usuário quer encerrar o programa
		}while(!(encerrarPrograma.equalsIgnoreCase("S")));
	}

}
