/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Lista 1 - Exercicio 06
 *  
 *  Enunciado:
 *  
 *  Fazer um programa que leia tr�s valores com ponto flutuante
 *  de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
 *  
 *  a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
 *  b) a �rea do c�rculo de raio C. (pi = 3.14159)
 *  c) a �rea do trap�zio que tem A e B por bases e C por altura.
 *  d) a �rea do quadrado que tem lado B.
 *  e) a �rea do ret�ngulo que tem lados A e B.
 *  
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Define o . como separador decimal (Padr�o EUA)
		Locale.setDefault(Locale.US);
		
		// Declara��o do Scanenr
		Scanner leia = new Scanner( System.in );
		
		// Declara��o de vari�veis
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
		
		// Declara��o de vari�veis de area
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
