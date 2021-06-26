package exercicios.secao05;

import java.util.Scanner;

public class Exercicio52 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dinheiro = 0, troco = 0;

		System.out.print("Valor do Saque: ");
		dinheiro = scan.nextInt();

		if (dinheiro >= 100) {
			dinheiro = dinheiro % 100;
			troco = dinheiro / 100;
			System.out.println(dinheiro);
			dinheiro = troco;
		}
		if (dinheiro >= 50) {
			dinheiro = dinheiro % 50;
			dinheiro = dinheiro / 50;
			System.out.println(dinheiro);

		}
		if (dinheiro >= 20) {
			dinheiro = dinheiro % 20;
			dinheiro = dinheiro / 20;
			System.out.println(dinheiro);

		}
		if (dinheiro >= 10) {
			dinheiro = dinheiro % 10;
			dinheiro = dinheiro / 10;
			System.out.println(dinheiro);

		}
		if (dinheiro >= 5) {
			dinheiro = dinheiro % 5;
			dinheiro = dinheiro / 5;
			System.out.println(dinheiro);

		}
		if (dinheiro >= 2) {
			dinheiro = dinheiro % 2;
			dinheiro = dinheiro / 2;
			System.out.println(dinheiro);

		}
		if (dinheiro >= 1) {
			dinheiro = dinheiro % 1;
			dinheiro = dinheiro / 1;
			System.out.println(dinheiro);

		}

		System.out.println();
		scan.close();

	}

}
