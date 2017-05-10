package br.com.fiap.rep;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra com mais de 3 caracteres");
		String nome = scanner.next();
		
		for (int i = 0;  nome.length() <= 3; i++) {
			
			System.out.println("nome inválido, digite novamente");
			nome = scanner.next();
			
			if (nome.length() > 3) {
				System.out.println("nome validado");
			}
		}
		
		scanner.close();
		
	}

}
