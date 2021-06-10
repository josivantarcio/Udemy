package exercicios.secao05;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		int n = 1, e = 1, fat = 1;

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		n = scan.nextInt();

		for (int i = 1; i < n; i++) {

			for (int j = i; j >= 1; j--) {
				fat *= j;
			}

			if (i == 1) {
				e = 1 + 1 / fat;
			}
			e += 1 / fat;

		}
		System.out.println(e);

		scan.close();
	}
}
