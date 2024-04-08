package application;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault( Locale.US );
		Scanner sc    = new Scanner( System.in );
		Scanner scStr = new Scanner( System.in );
		
		System.out.print("\n How many people do you want to add? : ");
		int qtPeople = sc.nextInt();
		
		Person[] people = new Person[qtPeople];
		
		for(int index = 0; index < people.length; index++) {
			
			System.out.printf("\n >>> Person %d's data: \n", index + 1);
			System.out.print(" Name..: ");
			String name = scStr.nextLine();
			System.out.print(" Age...: ");
			int age = sc.nextInt();
			System.out.print(" Height: ");
			double height = sc.nextDouble();
			
			people[index] = new Person( name , age , height );
		}
		
		System.out.printf("\n Average height: %.2f", averageHeight(people));
		String[] result = UnderSixteenOld(people);
		System.out.printf("\n People under sixteen: %s", result[0]);
		System.out.printf("\n People under sixteen: [%s]", result[1]);
	}
	
	static double averageHeight( Person[] people ) {
		
		double sumHeight = 0.0;
		
		for( Person p : people )
			sumHeight += p.getHeight();
		
		return sumHeight / people.length;
	}
	
	static String[] UnderSixteenOld( Person[] people ) {
		
		String[] undSixteenOld = { "0%" , "" };
		int qtPersonUnd16 = 0;
		
		for( Person p : people )
			if( p.getAge() < 16 ) {
				
				qtPersonUnd16++;
				undSixteenOld[1] += " " + p.getName() + " ";
			}
		undSixteenOld[0] = String.format("%.1f", ( (double)qtPersonUnd16 / (people.length) * 100)) + "%";
		
		return undSixteenOld;
	}

}
