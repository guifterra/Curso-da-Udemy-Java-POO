/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Lista 1 - Exercicio 06
 *  
 *  Enunciado:
 *  
 *  Fazer um programa que leia três valores com ponto flutuante
 *  de dupla precisão: A, B e C. Em seguida, calcule e mostre:
 *  
 *  a) a área do triângulo retângulo que tem A por base e C por altura.
 *  b) a área do círculo de raio C. (pi = 3.14159)
 *  c) a área do trapézio que tem A e B por bases e C por altura.
 *  d) a área do quadrado que tem lado B.
 *  e) a área do retângulo que tem lados A e B.
 *  
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Define o . como separador decimal (Padrão EUA)
		Locale.setDefault(Locale.US);
		
		// Declaração do Scanenr
		Scanner leia = new Scanner( System.in );
		
		// Declaração de variáveis
		double dimensaoA,
		       dimensaoB,
		       dimensaoC;
		
		// Leitura de dimensao
		System.out.print("\n Entre com a dimensao A: ");
		dimensaoA = leia.nextDouble();
		
		// Leitura de dimensao
		System.out.print("\n Entre com a dimensao B: ");
		dimensaoB = leia.nextDouble();
		
		// Leitura de dimensao
		System.out.print("\n Entre com a dimensao C: ");
		dimensaoC = leia.nextDouble();
		
		// Declaração de variáveis de area
		double areaTriangulo,
		       areaCirculo,
		       areaTrapezio,
		       areaQuadrado,
		       areaRetangulo;
		
		// Calculos
		areaTriangulo  = (dimensaoA * dimensaoC) / 2;
		areaCirculo    = 3.14159 * (Math.pow(dimensaoC, 2));
		areaTrapezio   = ((dimensaoA + dimensaoB) * dimensaoC / 2);
		areaQuadrado   = (Math.pow(dimensaoB, 2));
		areaRetangulo  = dimensaoA * dimensaoB;
		
		// Impressao das areas
		System.out.printf("\n Area do triangulo: %.3f", areaTriangulo);
		System.out.printf("\n Area do circulo..: %.3f", areaCirculo);
		System.out.printf("\n Area do trapezio.: %.3f", areaTrapezio);
		System.out.printf("\n Area do quadrado.: %.3f", areaQuadrado);
		System.out.printf("\n Area do retangulo: %.3f \n", areaRetangulo);
	}

}
