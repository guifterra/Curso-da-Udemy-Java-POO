package application;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault( Locale.US );
		Scanner sc = new Scanner( System.in );
		Scanner scStr = new Scanner( System.in );
		
		System.out.print("\n How many students will be add? : ");
		int qtStudents = sc.nextInt();
		
		Student[] students = new Student[qtStudents];
		
		for(int index = 0; index < students.length; index++) {
			
			System.out.printf("\nEnter name, first and second grade of Student %d: \n", index + 1);
			String name = scStr.nextLine();
			double[] g = new double[2];
			g[0] = sc.nextDouble();
			g[1] = sc.nextDouble();
			
			students[index] = new Student( name , g );
		}
		
		System.out.printf("\nApproved students: [%s]", getApprovedStudents(students));
	}
	
	static String getApprovedStudents( Student[] students ) {
		
		String approved = "";
		
		for(Student s : students) {
			
			double sumGrades = 0;
			int    qtGrades  = 0;
			
			for(double grade : s.getGrades()) {
				
				sumGrades += grade;
				qtGrades++;
			}
			
			if( (sumGrades / qtGrades) >= 6.0 )
				approved += " " + s.getName() + " ";
		}
		
		return approved;
	}

}
