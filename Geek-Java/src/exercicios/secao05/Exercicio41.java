package exercicios.secao05;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		Scanner resistencia = new Scanner(System.in);
		float R, r1, r2;

		while (true) {
			System.out.print("Digite R1: ");
			r1 = resistencia.nextFloat();

			System.out.print("Digite R2: ");
			r2 = resistencia.nextFloat();

			R = r1 * r2 / (r1 + r2);
			System.out.println(R);
			if (R == 0) {
				break;
			}
		}
		resistencia.close();
	}
}
