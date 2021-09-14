package exercicios.secao04;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = scan.nextInt();

		System.out.print("Tempo de Serviço: ");
		int tempoServico = scan.nextInt();

		if (idade >= 65 || tempoServico >= 30 || (idade >= 60 && tempoServico >= 25)) {
			System.out.println("Autorizado Aposentadoria");
		} else {
			System.out.println("NÃO Autorizado Aposentadoria");
		}

		scan.close();
	}
}
