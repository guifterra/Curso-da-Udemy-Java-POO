/*
 *  Autor: Guilherme Fabiano Terra
 *  S7 - Aula 01: Aplicando funções da String
 *  
 */

public class FuncoesDaString {

	public static void main(String[] args) {
		
		// Declaração das Strings
		String texto = " Testando funcoes da String ";
		String textoFormatado;
		
		// Testando toLowerCase()
		textoFormatado = texto.toLowerCase();
		System.out.printf("\n Original: -%s-", texto);
		System.out.printf("\n Alterado: -%s- \n", textoFormatado);
		
		// Testando toUpperCase()
		textoFormatado = texto.toUpperCase();
		System.out.printf("\n Original: -%s-", texto);
		System.out.printf("\n Alterado: -%s- \n", textoFormatado);
		
		// Testando trim
		textoFormatado = texto.trim();
		System.out.printf("\n Original: -%s-", texto);
		System.out.printf("\n Alterado: -%s- \n", textoFormatado);
		
		// Testando substring
		textoFormatado = texto.substring(9,18);
		System.out.printf("\n Original: -%s-", texto);
		System.out.printf("\n Alterado: -%s- \n", textoFormatado);
		
		// Testando replace
		textoFormatado = texto.replace("e","x");
		System.out.printf("\n Original: -%s-", texto);
		System.out.printf("\n Alterado: -%s- \n", textoFormatado);
		
		// Testando split
		String[] vetorDePalavras = texto.split(" ");
		
		System.out.printf("\n Palavra: %s", vetorDePalavras[1]);
		System.out.printf("\n Palavra: %s", vetorDePalavras[2]);
		System.out.printf("\n Palavra: %s", vetorDePalavras[3]);
		System.out.printf("\n Palavra: %s", vetorDePalavras[4]);
		
	}

}
