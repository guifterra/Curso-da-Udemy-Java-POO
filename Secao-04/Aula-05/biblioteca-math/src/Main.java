/*
 *  Autor: Guilherme Fabiano Terra
 *  S4 - Aula 05: Testando biblioteca Math
 *  
 */

public class Main {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		
		double A,B,C;
		
		// Tirando raizes
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(z);
		System.out.printf("\n Raiz quadrade de %.1f = %.2f", x, A);
		System.out.printf("\n Raiz quadrade de %.1f = %.2f", y, B);
		System.out.printf("\n Raiz quadrade de %.1f = %.2f \n", z, C);
		
		// Tirando potências
		A = Math.pow(x, 2);
		B = Math.pow(y, 3);
		C = Math.pow(z, 0);
		System.out.printf("\n O valor de %.1f elevado ao quadrado = %.2f", x, A);
		System.out.printf("\n O valor de %.1f elevado ao cubo     = %.2f", y, B);
		System.out.printf("\n O valor de %.1f elevado a  zero    = %.2f \n", z, C);
		
		// Tirando valor absoluto
		A = Math.abs(x);
		B = Math.abs(y);
		C = Math.abs(z);
		System.out.printf("\n O valor absoluto de %.1f = %.2f", x, A);
		System.out.printf("\n O valor absoluto de %.1f = %.2f", y, B);
		System.out.printf("\n O valor absoluto de %.1f = %.2f \n", z, C);
	}

}
