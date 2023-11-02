/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Aula 04: Operador tern�rio
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o e atribui��o de var
		double preco = 34.5, desconto;
		
		// Calculo de desconto a partir de tern�rio
		desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05 ;
		
		// Demonstra��o do desconto
		System.out.printf("\n Desconto do produto: %.2f", desconto );
	}

}
