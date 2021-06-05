package exercicios.secao05;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int v, soma = 0;
		float media = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o valor " + i + ": ");
			v = scan.nextInt();
			soma += v;

		}
		media = soma / 10;
		System.out.println("Total: " + media);

		scan.close();
	}
}
