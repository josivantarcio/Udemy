package exercicios.secao04;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double delta, a, b = 0.00, c = 0.00, x1, x2;

		System.out.print("A = ");
		a = scan.nextDouble();
		if (a != 0) {
			System.out.print("B = ");
			b = scan.nextDouble();

			System.out.print("C = ");
			c = scan.nextDouble();

		} else {
			System.out.println("Não é equação do 2º Grau!");
		}

		delta = (int) Math.pow(b, 2) - 4 * a * c;

		x1 = (-b + Math.sqrt(delta)) / 2 * a;
		x2 = (b + Math.sqrt(delta)) / 2 * a;

		if (delta < 0) {
			System.out.println("Não existe raiz");
		} else if (delta == 0) {
			System.out.println("Raiz única");
			System.out.println(x1);
		} else {
			System.out.println(x1);
			System.out.println(x2);
		}

		scan.close();
	}
}
