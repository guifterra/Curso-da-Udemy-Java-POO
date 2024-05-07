package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print("\n Enter n value: ");
		int n = sc.nextInt();
		
		System.out.print(" Enter m value: ");
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		System.out.println();
		for( int i = 0; i < mat.length; i++ ) {
			for( int j = 0; j < mat[i].length; j++ ) {
				
				System.out.printf(" Enter mat[%d][%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("\n >> MATRIZ: ");
		for( int i = 0; i < mat.length; i++ ) {
			System.out.print(" [");
			for( int j = 0; j < mat[i].length; j++ ) {
				
				System.out.printf(" %d ", mat[i][j]);
			}
			System.out.println("]");
		}
		
		System.out.print("\n Enter a value to find: ");
		int number = sc.nextInt();
		
		for( int i = 0; i < mat.length; i++ ) {
			for( int j = 0; j < mat[i].length; j++ ) {
				
				if( mat[i][j] == number ) {
					System.out.printf("\n >> Value find in [%d][%d] \n", i , j);
					
					if( i != 0 )
						System.out.print(" Up: " + mat[i - 1][j]);
					
					if( i != (mat.length - 1) )
						System.out.print(" Down: " + mat[i + 1][j]);
					
					if( j != 0 )
						System.out.print(" Left: " + mat[i][j - 1]);
					
					if( j != (mat[i].length - 1) )
						System.out.print(" Right: " + mat[i][j + 1]);
				}
			}
			System.out.println();
		}
		
	}

}
