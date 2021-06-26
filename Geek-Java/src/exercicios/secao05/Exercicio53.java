package exercicios.secao05;

import java.util.Scanner;

public class Exercicio53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;

		//Triangulo de Floyd
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(x + " ");
				if (j == i) {
					System.out.println(" ");
				}
				x++;
			}
		}
		sc.close();
	}
}
