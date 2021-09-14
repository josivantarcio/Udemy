package exercicios.secao04;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int ano = 0;

		System.out.print("Digite o ano: ");
		ano = scr.nextInt();
		if ((ano % 400 == 0) || (ano % 4 == 0) & (ano % 100 != 0)) {
			System.out.println("Bissexto");
		} else {
			System.out.println("Não Bissexto");
		}

		scr.close();
	}

}
