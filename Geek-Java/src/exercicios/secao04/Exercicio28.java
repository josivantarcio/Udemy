package exercicios.secao04;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, z;
		System.out.print("X: ");
		x = scan.nextInt();

		System.out.print("Y: ");
		y = scan.nextInt();

		System.out.print("Z: ");
		z = scan.nextInt();

		System.out.println("Escolha a fórmula:");
		System.out.println("(A) Geométria;\n(B) Ponderada;\n(C) Harmônica;\n(D) Aritmética.\n_");
		String item = scan.next().toUpperCase();
		float f = 0;

		switch (item) {
		case "A":
			f = 3 * (int) Math.sqrt(x * y * z);
			break;
		case "B":
			f = (x + 2 * y + 3 * z) / 6;
			break;
		case "C":
			f = 1 / ((1 / x) + (1 / y) + (1 / z));
			break;
		case "D":
			f = (x + y + z) / 3;
			break;
		}
		System.out.println(f);

		scan.close();
	}

}
