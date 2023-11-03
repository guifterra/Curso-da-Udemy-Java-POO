/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 3 - Exercicio 02
 *  
 *  Enunciado:
 *  
 *  Escreva um programa para ler as coordenadas (X,Y) de uma
 *  quantidade indeterminada de pontos no sistema cartesiano.
 *  Para cada ponto escrever o quadrante a que ele pertence.
 *  
 *  O algoritmo será encerrado quando pelo menos uma de duas
 *  coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 *  
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		// Declaração de Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração das variaveis de coordenada
		int x, y;
		
		// Repete enquanto uma das duas coordenadas não for nula
		do {
			
			System.out.print("\n Entre com a coordenada X: ");
			x = leia.nextInt();
			
			System.out.print("\n Entre com a coordenada Y: ");
			y = leia.nextInt();
			
			// Verifica se nenhum 0 foi digitado
			if((x != 0) && (y != 0)) {
				
				// Verifica se X é positivo
				if(x > 0) {
					
					// Verifica se Y é positivo
					if(y > 0) {
						
						System.out.print("\n 1° Quadrante \n");
						
					}else{
						
						System.out.print("\n 4° Quadrante \n");
					}
					
				}else {
					
					// Verifica se Y é positivo
					if(y > 0) {
						
						System.out.print("\n 2° Quadrante \n");
						
					}else{
						
						System.out.print("\n 3° Quadrante \n");
					}
				}
			}
			
		}while((x != 0) && (y != 0));
	}

}
