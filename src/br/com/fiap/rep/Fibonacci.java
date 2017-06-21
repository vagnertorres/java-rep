package br.com.fiap.rep;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valorUm = 1;
		int valorDois = 1;
		int valorTres = 0;
		
		System.out.println("Entre com o valor do enésimo termo");
		int valorEnesimo = scanner.nextInt();
		
		System.out.println("série de Fibonacci: " +valorEnesimo+ " termos:\n");
		
		System.out.println(valorUm + " " + valorDois + " ");
		
		int contador = 3;
		
		while (contador <= valorEnesimo) {
			 
			valorTres = valorUm + valorDois;
			valorUm = valorDois;
			valorDois = valorTres;
			System.out.println(valorTres + " ");
			contador++;
			
		}
		scanner.close();
	}
}
