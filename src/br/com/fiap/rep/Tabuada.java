package br.com.fiap.rep;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a tabuada");
		int numero = scanner.nextInt();
		
		scanner.close();
		
		int i = 1;
		
		while (i <= 10) {
			
			System.out.println(numero * i);
			i++;
		}
	}
}
