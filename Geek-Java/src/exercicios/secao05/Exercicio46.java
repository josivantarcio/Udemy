package exercicios.secao05;

import java.util.Random;
import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random sorteio = new Random();

		int num, i = 0;
		int sort = sorteio.nextInt(1000);
		while (true) {
			System.out.print("Digite um numero [1 - 1000] ");
			num = scan.nextInt();
			i++;
			if (num == sort) {
				System.out.println("Parabéns você acertou!");
				break;
			} else if (sort > num) {
				System.out.println("O numero sorteado é maior! Tente novamente");
			} else {
				System.out.println("O numero sorteado é menor! Tente novamente");
			}

		}
		System.out.println(i + " tentativas");
		System.out.println("FIM");
		scan.close();
	}

}
