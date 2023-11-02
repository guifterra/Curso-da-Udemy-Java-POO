/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Lista 2 - Exercicio 05
 *  
 *  Enunciado:
 *  
 *  Com base na tabela abaixo, escreva um programa que leia
 *  o código de um item e a quantidade deste item. A seguir,
 *  calcule e mostre o valor da conta a pagar.
 *  
 *  Código 1:
 *  	Cachorro Quente................. R$ 4,00
 *  
 *  Código 2:
 *  	X-Salada........................ R$ 4,50
 *  
 *  Código 3:
 *  	X-Bacon......................... R$ 5,00
 *  
 *  Código 4:
 *  	Torrada Simples................. R$ 2,00
 *  
 *  Código 5:
 *  	Refrigerante.................... R$ 1,50
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração e Leitura do código e quantidade
		System.out.print("\n Entre com o codigo....: ");
		int codigo = leia.nextInt();
		
		System.out.print("\n Entre com a quantidade: ");
		int quantidade = leia.nextInt();
		
		// Testando o codigo e preço total
		if(codigo == 1) {
			
			System.out.print("\n Total a pagar: R$ " + (quantidade * 4));
			
		}else if(codigo == 2) {
			
			System.out.print("\n Total a pagar: R$ " + (quantidade * 4.5));
			
		}else if(codigo == 3) {
			
			System.out.print("\n Total a pagar: R$ " + (quantidade * 5));
			
		}else if(codigo == 4) {
			
			System.out.print("\n Total a pagar: R$ " + (quantidade * 2));
			
		}else if(codigo == 5) {
			
			System.out.print("\n Total a pagar: R$ " + (quantidade * 1.5));
			
		}else {
			
			System.out.print("\n Codigo invalido! ");
		}

	}

}
