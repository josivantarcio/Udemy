package exercicios.secao05;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = scan.nextInt();
		int valor = 0;

		for (int i = n; i <= 17; i++) {
			if (11 % n == 0 || 13 % n == 0 || 17 % n == 0) {
				valor = i;
				break;
			}
		}

		System.out.println(valor);
		scan.close();
	}

}
