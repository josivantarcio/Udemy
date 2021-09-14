package exercicios.secao05;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;

		System.out.print("Valor Inicial e Final: ");
		int i = scan.nextInt();
		int f = scan.nextInt();

		if (i < f) {
			for (int x = i; x < f; x++) {
				if (x % 2 != 0) {
					soma += x;
				}
			}
		} else {
			System.out.println("Intervalo de válores inválido");
		}
		System.out.println("Soma dos impares desse intervalo: " + soma);

		scan.close();
	}

}
