package br.com.fiap.rep;

public class NumeroImpar {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 50) {
			
			if (i % 2 == 1) {
				System.out.println("Números impar: " + i);
			}
			
			i++;		
		}
		
	}
}
