package exercicios.secao05;

import java.util.Scanner;

public class Exercicio52 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dinheiro = 0, troco = 0;

		System.out.print("Valor do Saque: ");
		dinheiro = scan.nextInt();

		if (dinheiro >= 100) {
			troco = dinheiro % 100;
			dinheiro -= troco;
			dinheiro /= 100;

			System.out.println("Notas de 100: " + dinheiro);
			dinheiro = troco;
		}
		if (dinheiro >= 50) {
			troco = dinheiro % 50;
			dinheiro -= troco;
			dinheiro /= 50;

			System.out.println("Notas de 50: " + dinheiro);
			dinheiro = troco;
		}
		if (dinheiro >= 20) {
			troco = dinheiro % 20;
			dinheiro -= troco;
			dinheiro /= 20;

			System.out.println("Notas de 20: " + dinheiro);
			dinheiro = troco;
		}
		if (dinheiro >= 10) {
			troco = dinheiro % 10;
			dinheiro -= troco;
			dinheiro /= 10;

			System.out.println("Notas de 10: " + dinheiro);
			dinheiro = troco;
		}
		if (dinheiro >= 5) {
			troco = dinheiro % 5;
			dinheiro -= troco;
			dinheiro /= 5;

			System.out.println("Notas de 5: " + dinheiro);
			dinheiro = troco;
		}
		if (dinheiro >= 2) {
			troco = dinheiro % 2;
			dinheiro -= troco;
			dinheiro /= 2;

			System.out.println("Notas de 2: " + dinheiro);
			dinheiro = troco;
		}
		if (dinheiro >= 1) {
			troco = dinheiro % 1;
			dinheiro -= troco;
			dinheiro /= 1;

			System.out.println("Notas de 1: " + dinheiro);
			dinheiro = troco;
		}

		scan.close();

	}

}
