/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 4 - Exercicio 02
 *  
 *  Enunciado:
 *  
 *  Leia um valor inteiro N. Este valor será a quantidade de
 *  valores inteiros X que serão lidos em seguida. Mostre
 *  quantos destes valores X estão dentro do intervalo [10,20]
 *  e quantos estão fora do intervalo, mostrando essas
 *  informações. 
 *  
 *  Use a palavra "in" para dentro do intervalo, e
 *  "out" para fora do intervalo.
 *  
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declaração de quantidade in e out
		int in = 0, out = 0;
		
		// Declaração e leitura da quantidadeDeLeituras
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
