package exercicios.secao05;

import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = 0, h = 0;

		System.out.print("Digite um número: ");
		n = sca.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				h = 1 + 1 / (i + 1);
			}
			h += 1 / i;
		}
		System.out.println(h);

		sca.close();
	}
}
