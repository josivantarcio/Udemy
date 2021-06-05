package exercicios.secao05;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int v, i = 1, soma = 0;
		float media = 0;
		while (i <= 10) {
			System.out.print("Digite o valor " + i + ": ");
			v = scan.nextInt();
			if (v > 0) {
				soma += v;
				i++;
			}
		}
		media = soma / 10;
		System.out.println("Total: " + media);

		scan.close();
	}
}
