/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Lista 1 - Exercicio 04
 *  
 *  Enunciado:
 *  
 *  Fazer um programa que leia o número de um funcionário, seu
 *  número de horas trabalhadas, o valor que recebe por hora e
 *  calcula o salário desse funcionário. A seguir, mostre o
 *  número e o salário do funcionário, com duas casas decimais.
 *  
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Defini o decimal como . (Padrão dos EUA)
		Locale.setDefault(Locale.US);
		
		// Declaração do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declaração de variáveis
		int numeroDoFuncionario,
			numeroDeHorasDeTrab;
		
		double ganhoPorHorasDeTrab,
		       salarioDoFuncionario;
		
		// Leitura de numero do funcionario
		System.out.print("\n Entre com o numero do funcionario.........: ");
		numeroDoFuncionario = leia.nextInt();
		
		// Leitura das hora trabalhadas
		System.out.print("\n Entre com o numero de horas do funcionario: ");
		numeroDeHorasDeTrab = leia.nextInt();
		
		// Leitura do ganho / hora do funcionario
		System.out.print("\n Entre com o ganho por hora do funcionario.: ");
		ganhoPorHorasDeTrab = leia.nextDouble();
		
		// Calculo de salario
		salarioDoFuncionario = numeroDeHorasDeTrab * ganhoPorHorasDeTrab;
		
		// Impressao dos dados
		System.out.print("\n Employee number: " + numeroDoFuncionario);
		System.out.print("\n Salary.........: U$ " + salarioDoFuncionario + "\n");

	}

}
