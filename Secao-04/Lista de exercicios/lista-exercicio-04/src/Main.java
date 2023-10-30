/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Lista 1 - Exercicio 04
 *  
 *  Enunciado:
 *  
 *  Fazer um programa que leia o n�mero de um funcion�rio, seu
 *  n�mero de horas trabalhadas, o valor que recebe por hora e
 *  calcula o sal�rio desse funcion�rio. A seguir, mostre o
 *  n�mero e o sal�rio do funcion�rio, com duas casas decimais.
 *  
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Defini o decimal como . (Padr�o dos EUA)
		Locale.setDefault(Locale.US);
		
		// Declara��o do Scanner
		Scanner leia = new Scanner( System.in );
		
		// Declara��o de vari�veis
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
