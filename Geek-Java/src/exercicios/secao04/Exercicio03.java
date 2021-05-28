package exercicios.secao04;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		float n = scan.nextFloat();
		if (n > 0) {
			n = (int) Math.sqrt(n);
		} else {
			n = (int) Math.pow(n, 2);
		}
		System.out.println(n);

		scan.close();
	}
}
