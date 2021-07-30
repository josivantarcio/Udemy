package exercicios.secao07;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Valor de A na Posição " + (i + 1) + ": ");
			a[i] = scan.nextInt();

			System.out.println("Valor de B na Posição " + (i + 1) + ": ");
			b[i] = scan.nextInt();

			c[i] = a[i] - b[i];
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println("Calculo " + (1 + i) + ": " + c[i]);
		}

		scan.close();

	}

}
