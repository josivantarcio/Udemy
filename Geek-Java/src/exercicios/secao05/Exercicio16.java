package exercicios.secao05;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		while (true) {
			System.out.print("Digite um número impar e positivo: ");
			int n = sca.nextInt();

			if (n > 0 && n % 2 != 0) {
				for (int i = n; i >= 1; i--) {
					System.out.println(i);
				}
				break;
			} else {
				System.out.print("ERRO! ");
			}
		}

		sca.close();
	}
}
