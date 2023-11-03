/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 3 - Exercicio 03
 *  
 *  Enunciado:
 *  
 *  Um Posto de combust�veis deseja determinar qual de seus
 *  produtos tem a prefer�ncia de seus clientes. Escreva um
 *  algoritmo para ler o tipo de combust�vel abastecido
 *  
 *  codificado da seguinte forma:
 *  1.�lcool 2.Gasolina 3.Diesel 4.Fim.
 *  
 *  Caso o usu�rio informe um c�digo inv�lido (fora da faixa
 *  de 1 a 4) deve ser solicitado um novo c�digo (at� que seja
 *  v�lido).
 *  
 *  O programa ser� encerrado quando o c�digo informado for o
 *  n�mero 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e
 *  a quantidade de clientes que abasteceram cada tipo de
 *  combust�vel.
 *  
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o de tipos de combust�vel
		int alcool   = 0,
			gasolina = 0,
			diesel   = 0;
		
		// Declara��o da var item
		int item = 0;
		
		// Leitura do item consumido
		while(item != 4) {
			
			System.out.print("\n - - -> MENU: \n");
			System.out.print("\n 1- Alcool");
			System.out.print("\n 2- Gasolina");
			System.out.print("\n 3- Diesel");
			System.out.print("\n 4- SAIR \n");
			
			System.out.print("\n Escolha um item: ");
			item = leia.nextInt();
			
			switch(item) {
				
				case 1:
						alcool++;
					break;
					
				case 2:
						gasolina++;
					break;
					
				case 3:
						diesel++;
					break;
					
				case 4:
						System.out.print("\n Fim do programa . . . \n");
					break;
					
				default:
						System.out.print("\n Valor invalido! Entre com outro valor. \n");
					break;
			}
		}
		
		System.out.print("\n MUITO OBRIGADO");
		System.out.print("\n Alcool..: " + alcool);
		System.out.print("\n Gasolina: " + gasolina);
		System.out.print("\n Diesel..: " + diesel + "\n");
	}

}
