package exercicios.secao05;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int v, soma = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o valor " + i + ": ");
			v = scan.nextInt();
			soma += v;

		}

		System.out.println("Total: " + soma);

		scan.close();
	}
}
