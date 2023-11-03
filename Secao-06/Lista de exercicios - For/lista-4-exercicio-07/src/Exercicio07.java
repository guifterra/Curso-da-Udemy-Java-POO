/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 07
 *  
 *  Enunciado:
 *  
 *  Fazer um programa para ler um número inteiro positivo N.
 *  O programa deve então mostrar na tela N linhas, começando
 *  de 1 até N. Para cada linha, mostrar o número da linha,
 *  depois o quadrado e o cubo do valor.
 *  
 */

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declaração e leitura do numero
		System.out.print("\n Digite um numero: ");
		int numero = leia.nextInt();
		
		// Repete as linhas
		for(int linha = 1; linha <= numero; linha++) {
			
			System.out.printf("\n Linha %d : %.0f %.0f",
			linha, (Math.pow(linha, 2)), (Math.pow(linha, 3)));
		}

	}

}
