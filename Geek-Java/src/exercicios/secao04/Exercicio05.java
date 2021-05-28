package exercicios.secao04;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Número: ");
		int n = scan.nextInt();
		if (n % 2 == 0) {
			System.out.println("Número Par");
		} else {
			System.out.println("Número Impar");
		}

		scan.close();
	}
}
