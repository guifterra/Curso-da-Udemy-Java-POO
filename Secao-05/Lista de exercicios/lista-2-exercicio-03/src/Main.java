/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Lista 2 - Exercicio 03
 *  
 *  Enunciado:
 *  
 *  Leia 2 valores inteiros (A e B). Ap�s, o programa deve
 *  mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
 *  indicando se os valores lidos s�o m�ltiplos entre si.
 *  
 *  Aten��o: os n�meros devem poder ser digitados em ordem
 *  crescente ou decrescente.
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o e Leitura de numeros A e B
		System.out.print("\n Entre com o valor de A: ");
		int a = leia.nextInt();
		
		System.out.print("\n Entre com o valor de B: ");
		int b = leia.nextInt();
		
		// Testa e exibe mensagem se s�o multiplos
		if(((a % b) == 0) || ((b % a) == 0)) {
			
			System.out.printf("\n Os valores %d e %d sao multiplos ! \n", a,b);
			
		}else {
			
			System.out.printf("\n Os valores %d e %d NAO sao multiplos ! \n", a,b);
		}

	}

}
