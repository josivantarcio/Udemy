package exercicios.secao04;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		float n = scan.nextFloat();

		if (n % 3 == 0 || n % 5 == 0) {
			if (n % 3 == 0 && n % 5 == 0) {
				System.out.println("ERRO! Número não aceito. Divisível por 3 e 5!");
			} else {
				if (n % 3 == 0) {
					System.out.println("Divisível por 3!");
				} else {
					System.out.println("Divisível por 5!");
				}
			}
		} else {
			System.out.println("Não é divisível nem 3 e nem 5!");
		}

		scan.close();

	}

}
