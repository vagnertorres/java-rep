package br.com.fiap.rep;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		double media;
		int i = 0;
		
		while (i < 5) {
			
			System.out.println("Digite um número");
			numero = scanner.nextInt();
			
			soma += numero;
			i++;
		}
		
		media = soma / 5;
		
		scanner.close();
		
		System.out.println("soma: " + soma);
		System.out.println("média: " + media);

	}

}
