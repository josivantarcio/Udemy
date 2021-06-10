package exercicios.secao05;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n = scan.nextInt();

		System.out.print("Divisores de " + n + ": D(" + n + ") = { ");

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("}");

		scan.close();

	}

}
