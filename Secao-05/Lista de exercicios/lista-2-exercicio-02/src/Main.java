/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Lista 2 - Exercicio 02
 *  
 *  Enunciado:
 *  
 *  Fazer um programa para ler um número inteiro e dizer se
 *  este número é par ou ímpar.
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Leitura e declaração do numero
		System.out.print("\n Entre com um numero: ");
		int numero = leia.nextInt();
		
		// Verificando e exibindo mensagem se é primo ou não
		if((numero % 2) == 0) {
			
			System.out.print("\n O numero inserido EH par ! \n");
			
		}else {
			
			System.out.print("\n O numero inserido NAO EH par ! \n");
		}

	}

}
