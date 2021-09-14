package exercicios.secao05;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Digite um número par positivo: ");
			int n = scan.nextInt();

			if (n > 0 && n % 2 == 0) {
				for (int i = n; i >= 0; i--) {
					System.out.println(i);
				}
				break;
			} else {
				System.out.print("ERRO! ");
			}
			scan.close();
		}
	}
}
