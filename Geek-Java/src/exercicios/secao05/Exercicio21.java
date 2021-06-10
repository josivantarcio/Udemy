package exercicios.secao05;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int somaPar = 0, multi = 1;

		System.out.println("Digite numero a: ");
		int a = scan.nextInt();

		System.out.println("Digite numero b: ");
		int b = scan.nextInt();

		if (a < b) {
			for (int i = a; i <= b; i++) {

				if (i % 2 == 0) {
					somaPar += i;
				} else {
					multi *= i;
				}
			}
		} else if (a > b) {

			for (int i = b; i <= a; i++) {

				if (i % 2 == 0) {
					somaPar += i;
				} else {
					multi *= i;
				}
			}
		} else {

			System.out.println("Números Iguais");
			multi = 0;
			somaPar = 0;
		}

		System.out.println("Total Par: + " + somaPar);
		System.out.println("Total Impares: x " + multi);
		scan.close();
	}

}
