/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Lista 2 - Exercicio 02
 *  
 *  Enunciado:
 *  
 *  Fazer um programa para ler um n�mero inteiro e dizer se
 *  este n�mero � par ou �mpar.
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Leitura e declara��o do numero
		System.out.print("\n Entre com um numero: ");
		int numero = leia.nextInt();
		
		// Verificando e exibindo mensagem se � primo ou n�o
		if((numero % 2) == 0) {
			
			System.out.print("\n O numero inserido EH par ! \n");
			
		}else {
			
			System.out.print("\n O numero inserido NAO EH par ! \n");
		}

	}

}
