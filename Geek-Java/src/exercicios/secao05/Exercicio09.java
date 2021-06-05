package exercicios.secao05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n = sc.nextInt();
		int i = 0, x = 0;

		while (x < n) {
			if (i % 2 != 0) {
				System.out.println(i);
				x++;
			}
			i++;
		}
		sc.close();

	}

}
