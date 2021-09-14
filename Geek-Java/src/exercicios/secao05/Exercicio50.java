package exercicios.secao05;

import java.util.Scanner;

public class Exercicio50 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float altChico = 1.5f, altZe = 1.1f;
		int anos = 0;

		while (altChico >= altZe) {
			anos++;
			altChico += 0.02f;
			altZe += 0.03f;

		}

		System.out.println(anos + " Anos");

		scan.close();

	}

}
