/*
 *  Autor: Guilherme Fabiano Terra
 *  S4: print, println e printf - imprimindo vari�veis
 *  
 */

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		// Declara��o e atribui��o de vari�veis
		int    y     = 32;
		int    idade = 31;
		double x     = 10.35784;
		double renda = 4000.0;
		String nome  = "Maria";

		// Impress�es
		System.out.println("\n - y: " + y);
		System.out.println(" - x: " + x);
		
		System.out.print("\n Ola mundo!");
		System.out.println(" Bom dia! \n");
		
		// Impress�es com , (Padr�o no Computador BR)
		System.out.printf(" %.2f \n", x);
		System.out.printf(" %.4f \n", x);
		
		// Trocando para o padr�o dos EUA
		Locale.setDefault(Locale.US);
		
		// Impress�es com . (Padr�o no Computador dos EUA)
		System.out.printf("\n %.2f \n", x);
		System.out.printf(" %.4f \n", x);
		
		System.out.printf("\n Resultado: %.4f metros", x);
		
		System.out.printf("\n %s tem %d anos e ganha R$ %.2f reais \n",nome,idade,renda);
	}

}
