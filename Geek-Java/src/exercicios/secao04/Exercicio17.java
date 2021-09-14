package exercicios.secao04;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float altura, bMaior, bMenor, area;

		System.out.print("Altura: ");
		altura = scan.nextFloat();

		System.out.print("Base Maior: ");
		bMaior = scan.nextFloat();
		if (bMaior > 0) {

			System.out.print("Base Menor: ");
			bMenor = scan.nextFloat();
			if (bMenor > 0) {

				area = (bMaior + bMenor) * altura / 2;
				System.out.println("Area do Trapézio: " + area);

			} else {
				System.out.println("ERRO! Base Menor deve ser maior que ZERO!");
			}

		} else {
			System.out.println("ERRO! Base Maior deve ser maior que ZERO!");
		}

		scan.close();
	}
}
