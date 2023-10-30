/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Lista 1 - Exercicio 02
 *  
 *  Enunciado:
 *  
 *  Fa�a um programa para ler o valor do raio de um c�rculo,
 *  e depois mostrar o valor da �rea deste c�rculo com quatro
 *  casas decimais conforme exemplos.F�rmula da �rea: 
 *  
 *  area = pi . raio2
 *  
 *  Considere o valor de pi = 3.14159
 *  
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner( System.in );
		
		double raioDoCirculo,
			   area,
			   pi;
		
		pi = 3.14159;
		
		System.out.print("\n Entre com o raio do circulo (Use . como separador decimal): ");
		raioDoCirculo = leia.nextDouble();
		
		area = pi * (Math.pow(raioDoCirculo, 2));
		
		System.out.printf("\n A area do circulo de raio %.2f e: %.4f \n", raioDoCirculo, area);

	}

}
