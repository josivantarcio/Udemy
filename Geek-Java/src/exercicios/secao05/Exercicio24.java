package exercicios.secao05;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n = scan.nextInt();
		int soma = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				soma += i;
			}
		}

		System.out.println(soma);
		scan.close();
	}
}
