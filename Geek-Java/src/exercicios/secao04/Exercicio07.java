package exercicios.secao04;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Número 1: ");
		int n1 = scan.nextInt();

		System.out.print("Número 2: ");
		int n2 = scan.nextInt();

		if (n1 > n2) {
			System.out.println("N1 é maior!");
		} else if (n1 < n2) {
			System.out.println("N2 é maior!");
		} else {
			System.out.println("Números Iguais!");
		}

		scan.close();
	}
}
