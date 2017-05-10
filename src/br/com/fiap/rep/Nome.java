package br.com.fiap.rep;

import java.util.Scanner;

public class Nome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma nome com mais de 3 caracteres");
		String palavra = scanner.next();
		
		int i = 0;
		
		while (palavra.length() <= 3) {
			
			System.out.println("nome inválido, digite novamente");
			palavra = scanner.next();
			
			i++;
		}
		
		scanner.close();
		
		System.out.println("nome validado");	
	}
}
