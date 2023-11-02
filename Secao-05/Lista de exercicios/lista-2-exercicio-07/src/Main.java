/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Lista 2 - Exercicio 07
 *  
 *  Enunciado:
 *  
 *  Leia 2 valores com uma casa decimal (x e y), que devem
 *  representar as coordenadas de um ponto em um plano.
 *  
 *  A seguir, determine qual o quadrante ao qual pertence o
 *  ponto, ou se está sobre um dos eixos cartesianos ou na
 *  origem (x = y = 0).
 *  
 *  Se o ponto estiver na origem, escreva a mensagem “Origem”.
 *  
 *  Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou
 *  “Eixo Y”, conforme for a situação.
 *  
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Troca a , por . na impressao (Padrão EUA)
		Locale.setDefault(Locale.US);
		
		// Declaração e leitura das coordenadas
		System.out.print("\n Entre com a coordenada x: ");
		double x = leia.nextDouble();
		
		System.out.print("\n Entre com a coordenada y: ");
		double y = leia.nextDouble();
		
		// Verificando se esta sobre um eixo, na origem ou dentro de um quadrante
		if(x == 0.0) {
			
			if(y == 0.0) {
				
				System.out.printf("\n O ponto de coordenadas %.1f , %.1f esta na origem \n", x, y);
				
			}else {
				
				System.out.printf("\n O ponto de coordenadas %.1f , %.1f esta no Eixo Y \n", x, y);
				
			}
			
		}else if(y == 0.0){
			
			System.out.printf("\n O ponto de coordenadas %.1f , %.1f esta no Eixo X \n", x, y);
			
		}else {
			
			if(x > 0) {
				
				if(y > 0) {
					
					System.out.printf("\n O ponto de coordenadas %.1f , %.1f esta no Q1 \n", x, y);
					
				}else {
					
					System.out.printf("\n O ponto de coordenadas %.1f , %.1f esta no Q4 \n", x, y);
				}
				
			}else{
				
				if(y > 0) {
					
					System.out.printf("\n O ponto de coordenadas %.1f , %.1f esta no Q2 \n", x, y);
					
				}else {
					
					System.out.printf("\n O ponto de coordenadas %.1f , %.1f esta no Q3 \n", x, y);
				}
			}	
		}
	}

}
