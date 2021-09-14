package exercicios.secao07.parte1;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n[] = new int[8];
		for (int i = 0; i < n.length; i++) {
			System.out.print("valor #" + i + ": ");
			n[i] = scan.nextInt();
		}
		int x = 0, y = 0;

		System.out.print("Digite X ");
		x = scan.nextInt();
		x = n[x];

		System.out.print("Digite Y ");
		y = scan.nextInt();
		y = n[y];

		int somar = x + y;

		System.out.println(somar);

		scan.close();
	}

}
