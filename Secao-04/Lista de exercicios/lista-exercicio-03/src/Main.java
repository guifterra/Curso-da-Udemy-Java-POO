/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Lista 1 - Exercicio 03
 *  
 *  Enunciado:
 *  
 *  Fazer um programa para ler quatro valores inteiros A, B, C
 *  e D. A seguir, calcule e mostre a diferença do produto de
 *  A e B pelo produto de C e D segundo a fórmula:
 *  
 *  DIFERENCA = (A * B - C * D).
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declaração de variáveis
		int a, b, c, d, diferenca;
		
		// Leitura de a
		System.out.print("\n Entre com o valor de A: ");
		a = leia.nextInt();
		
		// Leitura de b
		System.out.print("\n Entre com o valor de B: ");
		b = leia.nextInt();
		
		// Leitura de c
		System.out.print("\n Entre com o valor de C: ");
		c = leia.nextInt();
		
		// Leitura de d
		System.out.print("\n Entre com o valor de D: ");
		d = leia.nextInt();
		
		// Calculo
		diferenca = a * b - c * d;
		
		// Impressao do Resultado
		System.out.print("\n O resultado da operacao e: " + diferenca + "\n");

	}

}
