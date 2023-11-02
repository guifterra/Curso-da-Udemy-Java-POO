/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Aula 01: Primeiro IF
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declaração do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declaração da variável hora
		int hora;
		
		// Leitura do horario
		System.out.print("\n Que horas sao? : ");
		hora = leia.nextInt();
		
		// Testando mensagem a ser exibida
		if(hora < 12) {
			
			System.out.print("\n Bom dia ! ");
			
		}else if(hora >= 12 && hora <= 18){
			
			System.out.print("\n Boa tarde ! ");
			
		}else{
			
			System.out.print("\n Boa noite ! ");
		}
		

	}

}
