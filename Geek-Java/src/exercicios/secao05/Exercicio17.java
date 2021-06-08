package exercicios.secao05;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		while (true) {
			System.out.print("Digite um número natural: ");
			int n = scan.nextInt();

			if (n > 0) {
				for (int i = 0; i <= n; i++) {
					soma += i;
				}
				break;
			} else {
				System.out.print("ERRO! ");
			}
		}
		System.out.println("Total " + soma);
		scan.close();

	}

}
