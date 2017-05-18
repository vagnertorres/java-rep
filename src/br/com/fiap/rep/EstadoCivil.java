package br.com.fiap.rep;

import java.util.Scanner;

public class EstadoCivil {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma letra que representa seu estado civil: S, C V ou D");
		String letra = scanner.next();
		
		while (!letra.equalsIgnoreCase("s") && !letra.equalsIgnoreCase("c") && !letra.equalsIgnoreCase("v") && !letra.equalsIgnoreCase("d")) {
			
			System.out.println("estado civil inválido, digite novamente");
			letra = scanner.next();
		}
		
		System.out.println("estado civil atualizado");
		
		scanner.close();
	}

}
