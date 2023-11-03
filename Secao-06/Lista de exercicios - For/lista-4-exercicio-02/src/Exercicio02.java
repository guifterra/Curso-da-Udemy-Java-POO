/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 02
 *  
 *  Enunciado:
 *  
 *  Leia um valor inteiro N. Este valor ser� a quantidade de
 *  valores inteiros X que ser�o lidos em seguida. Mostre
 *  quantos destes valores X est�o dentro do intervalo [10,20]
 *  e quantos est�o fora do intervalo, mostrando essas
 *  informa��es. 
 *  
 *  Use a palavra "in" para dentro do intervalo, e
 *  "out" para fora do intervalo.
 *  
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declara��o de quantidade in e out
		int in = 0, out = 0;
		
		// Declara��o e leitura da quantidadeDeLeituras
		System.out.print("\n Digite quantos numeros quer ler: ");
		int quantidadeDeLeituras = leia.nextInt();
		
		// Leitura dos valores
		for(int i = 1; i <= quantidadeDeLeituras; i++) {
			
			// Leitura do numero
			System.out.print("\n Entre com um numero: ");
			int numero = leia.nextInt();
			
			// Verifica se esta dentro ou fora do intervalo
			if((numero >= 10) && (numero <= 20))
				in++;
			else
				out++;
			
		}
		
		System.out.print("\n - - -> RESULTADO: \n");
		System.out.print("\n " + in + " in ");
		System.out.print("\n " + out + " out \n");
	}

}
