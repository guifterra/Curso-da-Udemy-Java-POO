/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Lista 2 - Exercicio 01
 *  
 *  Enunciado:
 *  
 *  Fazer um programa para ler um n�mero inteiro, e depois
 *  dizer se este n�mero � negativo ou n�o.
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );

		// Leitura de n�mero
		System.out.print("\n Entre com um numero: ");
		int numero = leia.nextInt();
		
		if(numero < 0) {
			
			System.out.print("\n O numero inserido eh negativo ! \n");
			
		}else {
			
			System.out.print("\n O numero inserido NAO eh negativo ! \n");
		}
	}

}
