package application;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault( Locale.US );
		Scanner sc = new Scanner( System.in );
		Scanner scStr = new Scanner( System.in );
		
		System.out.print("\n How many people will be add? : ");
		int qtPeople = sc.nextInt();
		
		Person[] people = new Person[qtPeople];
		
		for(int index = 0; index < people.length; index++) {
			
			System.out.printf("\n Enter person %da height: ", index + 1);
			double height = sc.nextDouble();			
			System.out.printf(" Enter person %da gender: ", index + 1);
			char gender = scStr.next().trim().charAt(0);
			
			people[index] = new Person( height , gender );
		}
		
		System.out.print("\n Shorter Height: " + shorterHeight(people));
		System.out.print("\n Greater Height: " + greaterHeight(people));
		System.out.printf("\n Woman average Height: %.2f", womanAverageHeight(people));
		System.out.print("\n Men quantity: " + menQuantity(people));
	}
	
	static double shorterHeight( Person[] people ) {
		
		double shortH = people[0].getHeight();
		
		for( Person p : people )
			if( shortH > p.getHeight() )
				shortH = p.getHeight();
		
		return shortH;
	}
	
	static double greaterHeight( Person[] people ) {
		
		double greatH = people[0].getHeight();
		
		for( Person p : people )
			if( greatH < p.getHeight() )
				greatH = p.getHeight();
		
		return greatH;
	}
	
	static double womanAverageHeight( Person[] people ) {
		
		double sumHeight = 0.0;
		int qtWoman = 0;
		
		for( Person p : people )
			if( 'F' == p.getGender() ) {
				sumHeight += p.getHeight();
				qtWoman++;
			}
		
		if(qtWoman != 0)
			return sumHeight / qtWoman;
		
		return 0.0;
	}
	
	static int menQuantity( Person[] people ) {
		
		int qtMen = 0;
		
		for( Person p : people )
			if( 'M' == p.getGender() )
				qtMen++;
		
		return qtMen;
	}
}
