package exercicios.secao05;

import java.util.Scanner;

public class Exercicio47 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float total = 0;
		while (true) {
			System.out.print("Digite o valor 1: ");
			float n1 = scan.nextFloat();

			System.out.print("Digite o valor 2: ");
			float n2 = scan.nextFloat();

			System.out.print("Escolha a opção: ");
			int opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				total = n1 + n2;
				break;
			case 2:
				total = n1 - n2;
				break;
			case 3:
				total = n1 * n2;
				break;
			case 4:
				total = n1 / n2;
				break;
			}
			if(opcao == 5) {
				break;
			}
			System.out.println("total: " + total);
		}

		System.out.println("FIM!");
		scan.close();

	}

}
