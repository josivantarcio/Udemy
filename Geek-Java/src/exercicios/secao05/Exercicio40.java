package exercicios.secao05;

import java.util.Scanner;

public class Exercicio40 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int n = 0, maior = 0, menor = 0;
		boolean flag = true;

		while (n >= 0) {
			System.out.print("Digite um número: ");
			n = num.nextInt();
			if (n < 0) {
				break;
			}
			if (flag == true) {
				maior = n;
				menor = n;
				flag = false;
			}
			if (maior < n) {
				maior = n;
			} else if (menor > n) {
				menor = n;
			}

		}
		System.out.println("Maior Numero: " + maior + "\nMenor Numero: " + menor);

		num.close();
	}
}
