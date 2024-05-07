package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print("\n Enter n value: ");
		int n = sc.nextInt();
		
		int[][] m = new int[n][n];
		
		for( int i = 0; i < m.length; i++ ) {
			for( int j = 0; j < m[i].length; j++ ) {
				System.out.printf(" Enter m[%d][%d]: ", i, j);
				m[i][j] = sc.nextInt();
			}
		}
		
		int qtNegatives = 0;
		
		System.out.println("\n >> MATRIZ: ");
		for( int i = 0; i < m.length; i++ ) {
			System.out.print(" [");
			for( int j = 0; j < m[i].length; j++ ) {
				System.out.printf(" %d ", m[i][j]);
				
				if( m[i][j] < 0 ) {
					qtNegatives++;
				}
			}
			System.out.println("]");
		}
		
		System.out.println("\n >> Main diagonal: ");
		System.out.print(" [");
		for( int i = 0; i < m.length; i++ ) {
			System.out.printf(" %d ", m[i][i]);
		}
		System.out.println("]");
		
		System.out.println("\n >> Negative quantity : " + qtNegatives);
		
		sc.close();
	}

}
