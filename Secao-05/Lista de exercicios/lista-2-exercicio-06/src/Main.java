/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Lista 2 - Exercicio 06
 *  
 *  Enunciado:
 *  
 *  Você deve fazer um programa que leia um valor qualquer e
 *  apresente uma mensagem dizendo em qual dos seguintes
 *  intervalos ([0,25], (25,50], (50,75], (75,100]) este valor
 *  se encontra. Obviamente se o valor não estiver em nenhum
 *  destes intervalos, deverá ser impressa a mensagem:
 *  
 *  “Fora de intervalo”.
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração e leitura do numero
		System.out.print("\n Entre com um numero (OBS: separador eh ponto ','): ");
		double numero = leia.nextDouble();
		
		if(numero >= 0.0 && numero <= 25.0) {
			
			System.out.print("\n O numero %.2f se encontra no intervalo de [ 0, 25 ] . \n");
			
		}else if(numero > 25.0 && numero <= 50.0) {
			
			System.out.print("\n O numero %.2f se encontra no intervalo de [ 25, 50 ] . \n");
			
		}else if(numero > 50.0 && numero <= 75.0) {
			
			System.out.print("\n O numero %.2f se encontra no intervalo de [ 50, 75 ] . \n");
			
		}else if(numero > 75.0 && numero <= 100.0) {
			
			System.out.print("\n O numero %.2f se encontra no intervalo de [ 75, 100 ] . \n");
			
		}else {
			
			System.out.print("\n Fora de intervalo ! \n");
		}
	}

}