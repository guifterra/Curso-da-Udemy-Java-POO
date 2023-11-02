/*
 *  Autor: Guilherme Fabiano Terra
 *  S5 - Lista 2 - Exercicio 04
 *  
 *  Enunciado:
 *  
 *  Leia a hora inicial e a hora final de um jogo. A seguir
 *  calcule a dura��o do jogo, sabendo que o mesmo pode come�ar
 *  em um dia e terminar em outro, tendo uma dura��o m�nima de
 *  1 hora e m�xima de 24 horas.
 *  
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o e leitura de horarios
		System.out.print("\n Entre com a hora inicial: ");
		int horaInicial = leia.nextInt();
		
		System.out.print("\n Entre com a hora final..: ");
		int horaFinal = leia.nextInt();
		
		// Declara��o de dura��o do jogo
		int duracaoDoJogo;
		
		// Verifica se at� o final do jogo o dia acabou
		if(horaInicial >= horaFinal) {
			
			// Calculo de dura��o do jogo (com troca de dia)
			duracaoDoJogo = 24 - horaInicial + horaFinal;
			
		}else {
			
			// Calculo de dura��o do jogo (sem troca de dia)
			duracaoDoJogo = horaFinal - horaInicial;
		}
		
		// Imprime duracao do jogo
		System.out.printf("\n O jogo durou: %02d hora(s) !\n", duracaoDoJogo);

	}

}
