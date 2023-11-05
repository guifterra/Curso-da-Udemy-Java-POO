/*
 *  Autor: Guilherme Fabiano Terra
 *  S7 - Aula 02: Sintaxe das Funções
 *  
 */

import java.util.Scanner;

public class CriandoFuncoes {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Lendo numeros
		System.out.print("\n Entre com o primeiro numero: ");
		int numero1 = leia.nextInt();
		
		System.out.print("\n Entre com o segundo numero.: ");
		int numero2 = leia.nextInt();
		
		System.out.print("\n Entre com o terceiro numero: ");
		int numero3 = leia.nextInt();
		
		// Usando funcao para identificar o maior
		int maior = identificaMaior(numero1,numero2, numero3);
		
		System.out.print("\n O maior numero e: " + maior + "\n");

	}
	
	public static int identificaMaior(int n1, int n2, int n3) {
		
		return Math.max(Math.max(n1, n2), n3);
	}

}
