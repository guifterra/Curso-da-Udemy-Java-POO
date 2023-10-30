/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Lista 1 - Exercicio 05
 *  
 *  Enunciado:
 *  
 *  Fazer um programa para ler o código de uma peça 1, o número
 *  de peças 1, o valor unitário de cada peça 1, o código de uma
 *  peça 2, o número de peças 2 e o valor unitário de cada peça
 *  2. Calcule e mostre o valor a ser pago.
 *  
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Definie . como separador decimal (Padrão EUA)
		Locale.setDefault(Locale.US);
		
		// Declaração de Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração de variáveis
		int codigoDaPeca,
		    numeroDePecas;
		
		double valorUnitarioDaPeca,
		       valorASerPagoNasPecas = 0;
		
		// Leitura de codigo da p1
		System.out.print("\n Entre com o codigo da peca 1........: ");
		codigoDaPeca = leia.nextInt();
		
		// Leitura de quantidade de peças p1
		System.out.print("\n Entre com a quantidade de pecas.....: ");
		numeroDePecas = leia.nextInt();
		
		// Leitura de preço da p1
		System.out.print("\n Entre com o valor unitario da peca 1: ");
		valorUnitarioDaPeca = leia.nextDouble();
		
		// Calculo
		valorASerPagoNasPecas += numeroDePecas * valorUnitarioDaPeca;
		
		// Leitura de codigo da p2
		System.out.print("\n Entre com o codigo da peca 2........: ");
		codigoDaPeca = leia.nextInt();
		
		// Leitura de quantidade de peças p2
		System.out.print("\n Entre com a quantidade de pecas.....: ");
		numeroDePecas = leia.nextInt();
		
		// Leitura de preço da p2
		System.out.print("\n Entre com o valor unitario da peca 2: ");
		valorUnitarioDaPeca = leia.nextDouble();
		
		// Calculo
		valorASerPagoNasPecas += numeroDePecas * valorUnitarioDaPeca;
		
		// Impressao da quantidade a ser paga
		System.out.printf("\n Amount to pay: U$ %.2f \n",valorASerPagoNasPecas);
	}

}
