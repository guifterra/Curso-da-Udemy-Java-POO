/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Lista 1 - Exercicio 01
 *  
 *  Enunciado:
 *  
 *  Fa�a um programa para ler dois valores inteiros, e depois
 *  mostrar na tela a soma desses n�meros com uma mensagem 
 *  explicativa.
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o de vari�veis
		int primeiroNumero,
			segundoNumero;
		
		// Leitura de numero 1
		System.out.print("\n Entre com um numero para a soma...: ");
		primeiroNumero = leia.nextInt();
		
		// Leitura de numero 2
		System.out.print("\n Entre com outro numero para a soma: ");
		segundoNumero  = leia.nextInt();
		
		// Impressao
		System.out.printf("\n\n Resultado da soma: %d \n", (primeiroNumero + segundoNumero));
	}

}
