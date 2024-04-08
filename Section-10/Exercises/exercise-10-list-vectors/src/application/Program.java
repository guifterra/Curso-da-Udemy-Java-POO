package application;

import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		Scanner scStr = new Scanner( System.in );
		
		System.out.print("\n How many people will you add? : ");
		int qtPeople = sc.nextInt();
		
		Person[] people = new Person[qtPeople];
		
		for(int index = 0; index < people.length; index++) {
			
			System.out.printf("\n >> People %d's data: \n", index + 1);
			System.out.print(" Enter the name: ");
			String name = scStr.nextLine();
			System.out.print(" Enter the age.: ");
			int age = sc.nextInt();
			
			people[index] = new Person( name , age );
		}
		
		System.out.print("\n Older person: " + getOlderPerson(people));
	}
	
	static String getOlderPerson( Person[] people ) {
		
		int indexOP = 0;
		
		for(int index = 1; index < people.length; index++) {
			
			if(people[indexOP].getAge() < people[index].getAge())
				indexOP = index;
		}
		
		return people[indexOP].getName();
	}
}
