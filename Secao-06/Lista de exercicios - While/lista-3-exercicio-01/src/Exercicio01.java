/*
 *  Autor: Guilherme Fabiano Terra
 *  S6 - Lista 3 - Exercicio 01
 *  
 *  Enunciado:
 *  
 *  Escreva um programa que repita a leitura de uma senha at�
 *  que ela seja v�lida. Para cada leitura de senha incorreta
 *  informada, escrever a mensagem "Senha Invalida". Quando a
 *  senha for informada corretamente deve ser impressa a
 *  mensagem "Acesso Permitido" e o algoritmo encerrado.
 *  
 *  Considere que a senha correta � o valor 2002.
 *  
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// Declara��o do Scanner
		Scanner leia = new Scanner ( System.in );
		
		// Declara��o da variavel senha
		int senha = 0;
		
		// Testa se senha est� correta
		while(senha != 2002) {
			
			// Leitura da senha
			System.out.print("\n Digite a senha: ");
			senha = leia.nextInt();
			
			// Verifica se acesso foi permitido
			if(senha != 2002){
				
				System.out.print("\n Senha invalida! \n");
				
			}else{
				
				System.out.print("\n Acesso permitido! \n");
			}
		}

	}

}