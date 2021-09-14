package exercicios.secao05;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		Scanner years = new Scanner(System.in);
		int idade, i = 0, allIdade = 0;

		while (true) {
			System.out.print("Digite a Idade: ");
			idade = years.nextInt();

			if (idade <= 0) {
				break;
			}
			i++;
			allIdade += idade;

		}
		float media = allIdade / i;
		System.out.println("Media: " + media);
		years.close();
	}

}
