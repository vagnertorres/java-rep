package br.com.fiap.rep;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		int numeroUm = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		int numeroDois = scanner.nextInt();
		
		int i = numeroUm;
		
		while (i <= numeroDois) {
			System.out.println(i);
			i++;
		}
		
		scanner.close();

	}

}
