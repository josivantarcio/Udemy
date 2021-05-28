package exercicios.secao04;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float nota1, nota2;

		System.out.print("Digite nota #1: ");
		nota1 = scan.nextFloat();

		if (nota1 >= 0 && nota1 <= 10) {
			System.out.print("Digite nota #2: ");
			nota2 = scan.nextFloat();

			if (nota2 >= 0 && nota2 <= 10) {
				float media = (nota1 + nota2) / 2;
				System.out.println("Média: " + media);
			} else {
				System.out.println("ERRO! O Valor " + nota2 + " não é válido!");
			}
		} else {
			System.out.println("ERRO! O Valor " + nota1 + " não é válido!");
		}

		scan.close();
	}
}
