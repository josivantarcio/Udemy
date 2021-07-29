package exercicios.secao07;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int positivo[] = new int[10];

		for (int i = 0; i < positivo.length; i++) {
			System.out.print("numero: ");
			positivo[i] = teclado.nextInt();

			if (positivo[i] < 0) {
				positivo[i] = 0;
			}
		}
		for (int i = 0; i < positivo.length; i++) {
			System.out.print(positivo[i] + " ");
		}

		teclado.close();
	}

}
