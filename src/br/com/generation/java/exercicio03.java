package br.com.generation.java;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int idade;
		
		System.out.println("Insira a idade do nadador: ");
		
		idade = in.nextInt();

		if (idade < 5) {
			System.out.println("\nIdade menor que 5! N�o h� categoria.");
		} else if (idade >= 5 && idade <= 7) {
			System.out.println("\nCategoria: Infantil A");
		} else if (idade >= 8 && idade <= 11) {
			System.out.println("\nCategoria: Infantil B");
		} else if (idade >= 12 && idade <= 13) {
			System.out.println("\nCategoria: Juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("\nCategoria: Juvenil B");
		} else {
			System.out.println("\nCategoria: Adultos");
		}
		
		in.close();
	}

}
