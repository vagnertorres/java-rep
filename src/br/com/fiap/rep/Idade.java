package br.com.fiap.rep;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma idade");
		int idade = scanner.nextInt();
		
		while (idade <= 0 || idade > 120) {
			
			System.out.println("Idade inv�lida, digite novamente");
			idade = scanner.nextInt();
		}
		
		System.out.println("Idade v�lida");
		
		scanner.close();

	}

}
