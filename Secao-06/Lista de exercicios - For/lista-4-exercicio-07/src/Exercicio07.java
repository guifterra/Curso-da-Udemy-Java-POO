/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 07
 *  
 *  Enunciado:
 *  
 *  Fazer um programa para ler um n�mero inteiro positivo N.
 *  O programa deve ent�o mostrar na tela N linhas, come�ando
 *  de 1 at� N. Para cada linha, mostrar o n�mero da linha,
 *  depois o quadrado e o cubo do valor.
 *  
 */

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declara��o e leitura do numero
		System.out.print("\n Digite um numero: ");
		int numero = leia.nextInt();
		
		// Repete as linhas
		for(int linha = 1; linha <= numero; linha++) {
			
			System.out.printf("\n Linha %d : %.0f %.0f",
			linha, (Math.pow(linha, 2)), (Math.pow(linha, 3)));
		}

	}

}
