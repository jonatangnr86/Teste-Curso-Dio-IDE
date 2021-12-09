package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Oliver","Amarelo", 5); // Passa atributos por parametro
		
		System.out.println("Wello World!");
		int a = 3;
		int b = 2;
		System.out.println("A soma das varáveis é " + (a + b) + "\n");
        System.out.println(gato);
	}
}
