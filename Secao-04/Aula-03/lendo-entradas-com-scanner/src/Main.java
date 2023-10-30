/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Aula 03: Lendo dados com o Scanner
 *  
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Torna o "." o separador de casas
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner ( System.in );
		
		// Declaração de variáveis
		String palavra;
		int    numero;
		double numeroFlutuante;
		char   letra;
		
		// Leitura de String
		System.out.print("\n Entre com uma palavra: ");
		palavra = leia.next();
		System.out.println(" A palavra digitada foi: " + palavra);
		
		// Leitura de Inteiro
		System.out.print("\n Entre com um numero..: ");
		numero = leia.nextInt();
		System.out.println(" O numero digitado foi.: " + numero);
		
		// Leitura de Double
		System.out.print("\n Entre com um numero..: ");
		numeroFlutuante = leia.nextDouble();
		System.out.println(" O numero digitado foi.: " + numeroFlutuante);
		
		// Leitura de Caracter
		System.out.print("\n Entre com uma letra..: ");
		letra = leia.next().charAt(0);
		System.out.println(" O numero digitado foi.: " + letra);
		
		leia.close();

	}

}
