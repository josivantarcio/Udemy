package exercicios.secao04;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float prova1, prova2, prova3, media;

		System.out.print("Nota1: ");
		prova1 = scan.nextFloat();

		System.out.print("Nota2: ");
		prova2 = scan.nextFloat();

		System.out.print("Nota3: ");
		prova3 = scan.nextFloat();

		media = (prova1 + prova2 + prova3 * 2) / 3;
		if (media >= 60.0) {
			System.out.println("Aprovado " + media);
		} else {
			System.out.println("Reprovado " + media);
		}

		scan.close();
	}
}
