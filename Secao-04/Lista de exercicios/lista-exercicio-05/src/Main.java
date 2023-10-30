/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Lista 1 - Exercicio 05
 *  
 *  Enunciado:
 *  
 *  Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero
 *  de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma
 *  pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a
 *  2. Calcule e mostre o valor a ser pago.
 *  
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Definie . como separador decimal (Padr�o EUA)
		Locale.setDefault(Locale.US);
		
		// Declara��o de Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o de vari�veis
		int codigoDaPeca,
		    numeroDePecas;
		
		double valorUnitarioDaPeca,
		       valorASerPagoNasPecas = 0;
		
		// Leitura de codigo da p1
		System.out.print("\n Entre com o codigo da peca 1........: ");
		codigoDaPeca = leia.nextInt();
		
		// Leitura de quantidade de pe�as p1
		System.out.print("\n Entre com a quantidade de pecas.....: ");
		numeroDePecas = leia.nextInt();
		
		// Leitura de pre�o da p1
		System.out.print("\n Entre com o valor unitario da peca 1: ");
		valorUnitarioDaPeca = leia.nextDouble();
		
		// Calculo
		valorASerPagoNasPecas += numeroDePecas * valorUnitarioDaPeca;
		
		// Leitura de codigo da p2
		System.out.print("\n Entre com o codigo da peca 2........: ");
		codigoDaPeca = leia.nextInt();
		
		// Leitura de quantidade de pe�as p2
		System.out.print("\n Entre com a quantidade de pecas.....: ");
		numeroDePecas = leia.nextInt();
		
		// Leitura de pre�o da p2
		System.out.print("\n Entre com o valor unitario da peca 2: ");
		valorUnitarioDaPeca = leia.nextDouble();
		
		// Calculo
		valorASerPagoNasPecas += numeroDePecas * valorUnitarioDaPeca;
		
		// Impressao da quantidade a ser paga
		System.out.printf("\n Amount to pay: U$ %.2f \n",valorASerPagoNasPecas);
	}

}
