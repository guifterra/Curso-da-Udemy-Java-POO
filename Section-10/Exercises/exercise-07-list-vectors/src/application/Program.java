package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print("\n How many values will each vector have? : ");
		int qtValues = sc.nextInt();
		
		int[] A = new int[qtValues];
		int[] B = new int[qtValues];
		int[] C = new int[qtValues];
		
		System.out.print("\n >> Vector A: \n");
		for(int index = 0; index < A.length; index++) {
			
			System.out.printf(" A[%d] = ", index);
			A[index] = sc.nextInt();
		}
		
		System.out.print("\n >> Vector B: \n");
		for(int index = 0; index < B.length; index++) {
			
			System.out.printf(" B[%d] = ", index);
			B[index] = sc.nextInt();
		}
		
		System.out.print("\n >> Vector C: ");
		for(int index = 0; index < C.length; index++) {
			
			C[index] = A[index] + B[index];
			System.out.printf("\n C[%d] = %d", index, C[index]);
		}
	}

}
