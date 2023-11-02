/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Lista 2 - Exercicio 08
 *  
 *  Enunciado:
 *  
 *  Em um pa�s imagin�rio denominado Lisarb, todos os habitantes
 *  ficam felizes em pagar seus impostos, pois sabem que nele
 *  n�o existem pol�ticos corruptos e os recursos arrecadados
 *  s�o utilizados em benef�cio da popula��o, sem qualquer
 *  desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.
 *  
 *  Leia um valor com duas casas decimais, equivalente ao
 *  sal�rio de uma pessoa de Lisarb. Em seguida, calcule e
 *  mostre o valor que esta pessoa deve pagar de Imposto de
 *  Renda, segundo a tabela abaixo.
 *  
 *  de R$ 0 a R$ 2000       - Isento
 *  de R$ 2000.01 a R$ 3000 - 08 %
 *  de R$ 3000.01 a R$ 4500 - 18 %
 *  + de 4500               - 28 %
 *  
 *  Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide
 *  � de 8% apenas sobre R$ 1000.00, pois a faixa de sal�rio
 *  que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de
 *  Renda. No exemplo fornecido (abaixo), a taxa � de 8% sobre
 *  R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36
 *  no total. O valor deve ser impresso com duas casas decimais.
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o e leitura do sal�rio
		System.out.print("\n Entre com o salario: ");
		double salario = leia.nextDouble();
		
		// Verifica em qual situa��o o salario se enquadra
		if(salario <= 0) {
			
			System.out.print("\n Valor invalido ! \n");
			
		}else if(salario > 0 && salario <= 2000){
			
			System.out.print("\n Voce esta isento de imposto de renda ! \n");
			
		}else if(salario > 2000 && salario <= 3000) {
			
			System.out.printf("\n Imposto a ser pago: R$ %.2f", ((salario - 2000) * 0.08));
			
		}else if(salario > 3000 && salario <= 4500) {
			
			System.out.printf("\n Imposto a ser pago: R$ %.2f", ((3000 - 2000) * 0.08) + ((salario - 3000) * 0.18));
			
		}else {
			
			System.out.printf("\n Imposto a ser pago: R$ %.2f", ((3000 - 2000) * 0.08) + ((4500 - 3000) * 0.18) + ((salario - 4500) * 0.28));
		}

	}

}
