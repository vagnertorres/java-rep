package br.com.fiap.rep;

public class Populacao {

	public static void main(String[] args) {
		
		double populacaoA = 80000;
		double populacaoB = 200000;
		double ano = 0;
		
		while (populacaoA <= populacaoB) {
			
			populacaoA += populacaoA * 0.3;
			populacaoB += populacaoB * 0.015;
			ano += 1;
			
		}
		
		System.out.println("A ultrapassa ou iguala a B em: " + ano + " anos");
	}
}
