package br.com.fiap.rep;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = scanner.next();
		
		System.out.println("Digite uma senha");
		String senha = scanner.next();
		
		while (senha.equals(nome)) {
			
			System.out.println("senha deve ser diferente do nome, digite novamente");
			senha = scanner.next();
		}
		
		System.out.println("Informações validadas");
		
		scanner.close();
	}
}
