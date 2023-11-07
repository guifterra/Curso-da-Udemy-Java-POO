/*
 *  Author: Guilherme Fabiano Terra
 *   
 */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class UseStudent {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		Student student = new Student();
		
		System.out.print("\n Enter name: ");
		student.name = sc.nextLine();
		
		System.out.print("\n Enter grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.print(" Enter grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.print(" Enter grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.print("\n FINAL GRADE: " + student.sumGrade());
		System.out.println("\n " + student.situation());

	}

}
