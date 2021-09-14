package exercicios.secao05;

import java.util.Scanner;

public class Exercicio39 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = 0, x = 0, y = 0;
		float a = 0;

		System.out.print("Base: ");
		b = scan.nextInt();
		if (b > 0) {

			System.out.print("Altura x: ");
			x = scan.nextInt();
			if (x > 0) {

				System.out.print("Altura y: ");
				y = scan.nextInt();
				if (y > 0) {
					a = (x + y) / b;
				}
			}
		}
		System.out.println(a);

		scan.close();
	}
}
