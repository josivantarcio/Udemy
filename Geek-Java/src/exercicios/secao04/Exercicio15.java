package exercicios.secao04;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Dia da Semana: ");
		int dia = scan.nextInt();
		if (dia >= 1 && dia <= 7) {
			switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-Feira");
				break;
			case 3:
				System.out.println("Terça-Feira");
				break;
			case 4:
				System.out.println("Quarta-Feira");
				break;
			case 5:
				System.out.println("Quinta-Feira");
				break;
			case 6:
				System.out.println("Sexta-Feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			}
		} else {
			System.out.println("ERRO! número deve está entre [1 - 7]");
		}
		scan.close();
	}

}
