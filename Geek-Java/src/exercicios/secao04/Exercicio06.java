package exercicios.secao04;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite número 1: ");
		int n1 = scan.nextInt();

		System.out.print("Digite número 2: ");
		int n2 = scan.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " é o maior. " + (n1 - n2));
		} else if (n2 > n1) {
			System.out.println(n2 + " é o maior. " + (n2 - n1));
		} else {
			System.out.println("ERRO! Os valores são iguais.");
		}

		scan.close();
	}
}
