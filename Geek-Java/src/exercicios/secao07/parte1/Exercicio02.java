package exercicios.secao07.parte1;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int n[] = new int[6];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < n.length; i++) {
			System.out.print("Digite um numero: ");
			n[i] = scan.nextInt();
		}

		for (int i = 0; i < n.length; i++) {
			System.out.print(" " + n[i]);
		}
		scan.close();
	}

}
