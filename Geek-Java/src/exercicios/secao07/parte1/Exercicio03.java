package exercicios.secao07.parte1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		double n[] = new double[10];
		double n2[] = new double[10];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < n.length; i++) {
			System.out.print("Digite um numero: ");
			n[i] = scan.nextDouble();
			n2[i] = Math.pow(n[i], 2);
		}
		for (int i = 0; i < n2.length; i++) {
			System.out.print(n2[i] + " ");
		}

		scan.close();
	}

}
