package exercicios.secao04;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float traLab, avaSementre, exaFinal, media = 0;

		System.out.print("Trabalho Laboratório: ");
		traLab = scan.nextFloat();
		if (traLab >= 0 && traLab <= 10) {

			System.out.print("Avaliação Semestral: ");
			avaSementre = scan.nextFloat();
			if (avaSementre >= 0 && avaSementre <= 10) {

				System.out.print("Exame Final: ");
				exaFinal = scan.nextFloat();
				if (exaFinal >= 0 && exaFinal <= 10) {

					media = (traLab * 2 + avaSementre * 3 + exaFinal * 5) / 10;
				} else {
					System.out.println("ERRO! Valor da Nota fora da faixa [0 - 10]");
				}
			} else {
				System.out.println("ERRO! Valor da Nota fora da faixa [0 - 10]");
			}
		} else {
			System.out.println("ERRO! Valor da Nota fora da faixa [0 - 10]");
		}

		if (media >= 0 && media <= 2.9f) {
			System.out.println("Reprovado "+ media);
		} else if (media >= 3 && media <= 4.9f) {
			System.out.println("Recuperação " + media);
		} else {
			System.out.println("Aprovado " + media);
		}

		scan.close();
	}
}
