/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Aula 03: Estrutura de repeti��o DoWhile
 *  
 *  - Criando um programa que converte a escala Celsius para 
 *  a escala Fahrenheit, enquanto o usu�rio desejar continuar
 *  
 */

import java.util.Scanner;

public class CelsiusParaFahr {

	public static void main(String[] args) {
		
		// Decla��o do Scanner de numeros e de Strings
		Scanner leia = new Scanner ( System.in );
		Scanner leiaStr = new Scanner ( System.in );
		
		// Declara��o das vari�veis
		double celsius, fahrenheit;
		String encerrarPrograma = "N";
		
		do {
			// Leitura da temperatura em Celsius
			System.out.print("\n Digite a temperatura em Celsius: ");
			celsius = leia.nextDouble();
			
			// Calculo da temperatura em Fahrenheit
			fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			
			// Impressao da temperatura em �F
			System.out.printf("\n Temperatura em Fahrenheit: %.1f \n", fahrenheit);
			
			// Leitura da decis�o do usu�rio
			System.out.print("\n Deseja encerrar o programa(s/n)? : ");
			encerrarPrograma = leiaStr.nextLine();
			
		// Verifica se usu�rio quer encerrar o programa
		}while(!(encerrarPrograma.equalsIgnoreCase("S")));
	}

}
