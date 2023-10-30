/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Aula 04: Lendo frases com o Scanner
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		String texto1,
			   texto2,
			   texto3;
		
		System.out.print("\n Entre com a frase 1: ");
		texto1 = leia.nextLine();
		
		System.out.print("\n Entre com a frase 2: ");
		texto2 = leia.nextLine();
		
		System.out.print("\n Entre com a frase 3: ");
		texto3 = leia.nextLine();
		
		System.out.println("\n - - -> FRASE DIGITAS: ");
		System.out.printf("\n - F1: \n\t %s", texto1);
		System.out.printf("\n - F2: \n\t %s", texto2);
		System.out.printf("\n - F3: \n\t %s \n", texto3);

	}

}
