/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 03
 *  
 *  Enunciado:
 *  
 *  Leia 1 valor inteiro N, que representa o número de casos
 *  de teste que vem a seguir. Cada caso de teste consiste de
 *  3 valores reais, cada um deles com uma casa decimal.
 *  
 *  Apresente a média ponderada para cada um destes conjuntos
 *  de 3 valores, sendo que o primeiro valor tem peso 2, o
 *  segundo valor tem peso 3 e o terceiro valor tem peso 5.
 *  
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		// Defini . como separador decimal (Padrão EUA)
		Locale.setDefault(Locale.US);
		
		// Declaração do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração e leitura do numero de casos
		System.out.print("\n Digite o numero de casos: ");
		int numeroDeCasos = leia.nextInt();
		
		// Repete os casos
		for(int caso = 1; caso <= numeroDeCasos; caso++) {
			
			// Variavel soma para calculo de media ponderada
			double soma = 0;
			
			// Lê os 3 valores
			for(int valor = 1; valor <= 3; valor++) {
				
				// Leitura dos valores
				System.out.print("\n Entre com o valor: ");
				double numero = leia.nextDouble();
				
				// identifica o peso a ser aplicado
				switch(valor) {
					
					case 1:
							// Peso 2
							soma += (numero * 2);
						break;
						
					case 2:
							// Peso 3
							soma += (numero * 3);
						break;
						
					case 3:
							// Peso 5
							soma += (numero * 5);
						break;
				}
			}
			
			// Imprime a media ponderada
			System.out.printf("\n Media pondera do caso: %.1f \n", (soma / 10));
		}

	}

}
