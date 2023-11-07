/*
 *  Author: Guilherme Fabiano Terra
 *   
 */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class UseEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		Employee employee = new Employee();
		
		System.out.print("\n Enter name: ");
		employee.name = sc.nextLine();
		
		System.out.print("\n Enter Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("\n Enter tax.........: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("\n\n Employee: %s, $ %.2f \n", employee.name, employee.netSalary());
		
		System.out.print("\n Which percentage to increase salary? Enter percentage: ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.printf("\n Updated data: %s, $ %.2f \n", employee.name, employee.netSalary());
	}

}
