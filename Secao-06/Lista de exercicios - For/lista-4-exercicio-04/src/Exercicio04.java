/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 04
 *  
 *  Enunciado:
 *  
 *  Fazer um programa para ler um número N. Depois leia N pares
 *  de números e mostre a divisão do primeiro pelo segundo. Se
 *  o denominador for igual a zero, mostrar a mensagem "divisao
 *  impossivel".
 *  
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		// Define . como separador decimal (Padrão EUA)
		Locale.setDefault(Locale.US);
		
		// Declaração do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declaração e leitura de quantas / serão realizadas
		System.out.print("\n Digite a quantidade de divisoes: ");
		int quantidadeDeDiv = leia.nextInt();
		
		// Leitura dos valores para divisão
		for(int numeroDaDiv = 1; numeroDaDiv <= quantidadeDeDiv; numeroDaDiv++) {
			
			// Leitura do numerador
			System.out.print("\n Entre com o numerador..: ");
			int numerador = leia.nextInt();
			
			// Leitura do numerador
			System.out.print("\n Entre com o denominador: ");
			int denominador = leia.nextInt();
			
			if(denominador != 0) {
				
				System.out.printf("\n Resultado da divisao (%d / %d): %.1f \n", numerador, denominador, ((double)numerador/denominador));
				
			}else {
				
				System.out.print("\n Divisao impossivel! \n");
			}
		}
	}

}
