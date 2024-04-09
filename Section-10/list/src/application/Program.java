package application;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marcos");
		
		list.remove("Ana");
		list.remove(0);
		list.removeIf( x -> x.charAt(0) == 'M' );
		
		System.out.printf("\n >> List ( %d people ): \n", list.size());
		for( String name : list )
			System.out.println(" - Name: " + name);
		
		System.out.print("\n Index of Bob: " + list.indexOf("Bob"));
		System.out.print("\n Index of Marco: " + list.indexOf("Marco"));
		
		List<String> list2 = list.stream().filter( x -> x.charAt(0) == 'A' ).collect(Collectors.toList());
		
		System.out.printf("\n\n >> List 2 ( %d people ): \n", list2.size());
		for( String name : list2 )
			System.out.println(" - Name: " + name);
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("\n First name with 'A': " + name);
		sc.close();
	}

}
