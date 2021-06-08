package exercicios.secao05;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, maior = 0, soma = 0;

		System.out.print("Quantidade de Números: ");
		int quant = scan.nextInt();

		for (int i = 1; i <= quant; i++) {
			System.out.print("Digite o número " + i + ": ");
			x = scan.nextInt();
			if(i == 1) {
				maior = x;
			}

			if (maior <= x) {
				maior = x;
				if(maior == x) {
					soma++;
				}
			}
		}

		System.out.print("O Maior número: " + maior + " foi lido " + soma + " vezes!");

		scan.close();
	}

}
