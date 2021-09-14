package exercicios.secao05;

import java.util.Scanner;

public class Exercicio54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int n = scan.nextInt();
		int x = 0;

		for (int i = 1; i <= n; i++) {
			if (n % 1 == 0 && n % i == 0) {
				x++;
			}
		}
		if (x == 2) {
			System.out.println("Primo");
		} else {
			System.out.println("Composto");
		}

		scan.close();
	}

}
