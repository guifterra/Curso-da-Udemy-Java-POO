/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Aula 04: Operador ternário
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração e atribuição de var
		double preco = 34.5, desconto;
		
		// Calculo de desconto a partir de ternário
		desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05 ;
		
		// Demonstração do desconto
		System.out.printf("\n Desconto do produto: %.2f", desconto );
	}

}
