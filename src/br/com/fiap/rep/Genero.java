package br.com.fiap.rep;

import java.util.Scanner;

public class Genero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite m ou f para especificar o seu sexo");
		String sexo = scanner.next();
		
		while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
			
			System.out.println("Sexo inválido, digita novamente");
			sexo = scanner.next();
		}
		
		System.out.println("Sexo validado");
		
		scanner.close();
	}
}
