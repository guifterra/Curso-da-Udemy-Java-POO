package application;

import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		Scanner scStr = new Scanner( System.in );
		Room[] rooms = new Room[10];
		
		System.out.print("\n How many rooms will be rented? : ");
		int qtRooms = sc.nextInt();
		int rent = 1;
		
		while(rent <= qtRooms) {
			
			System.out.println("\n Rent #" + rent + ":");
			
			System.out.print(" Enter name.: ");
			String name = scStr.nextLine();
			
			System.out.print(" Enter email: ");
			String email = scStr.nextLine();
			
			int number;
			do{
				System.out.print(" Enter room.: ");
				number = sc.nextInt();
			
			}while(!(number >= 1 && number <= 10 ));
			
			rooms[number - 1] = new Room( number , new Person( name , email) );
			rent++;
		}
		
		System.out.println("\n >> Busy rooms: ");
		for(int index = 0; index <= 9; index++)
			if( rooms[index] != null )
				System.out.println(rooms[index]);
		
		sc.close();
		scStr.close();
	}

}
