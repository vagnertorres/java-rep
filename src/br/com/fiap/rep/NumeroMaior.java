package br.com.fiap.rep;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int maiorNumero = Integer.MIN_VALUE;
		int i = 0;
		
		while (i < 5) {
			
			System.out.println("Entre com um número");
			numero = scanner.nextInt();
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			
			i++;
		}
		
		System.out.println("o maior numero digitado foi: " + maiorNumero);
		
		scanner.close();
	}
}
