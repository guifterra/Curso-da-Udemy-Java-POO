/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Aula 02: Exercicio
 *  
 *  Crie um programa que calcule o valor a ser pago por tempo
 *  de acesso ao conteudo, seguindo as seguintes condi��es:
 *  
 *  Pacote padr�o (1 a 100 min).............R$ 50,00
 *  Excedente de 100 min....................R$ 02,00 por minuto
 *  
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Define . como separador decimal
		Locale.setDefault(Locale.US);
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o e leitura da qnt de minutos
		System.out.print("\n Entre com a quantidade de min assistidos: ");
		int minutos = leia.nextInt();
		
		// Declara��o da conta
		double contaAPagar = 50;
		
		// Verifica se o tempo de 100 min foi excedido
		if(minutos > 100) {
			
			contaAPagar += (minutos - 100) * 2;
		}
		
		// Imprime valor a pagar
		System.out.printf("\n O valor a ser pago eh: R$ %.2f \n", contaAPagar);

	}

}
