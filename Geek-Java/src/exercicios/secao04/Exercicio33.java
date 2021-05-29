package exercicios.secao04;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float precoFinal = 0;

		System.out.print("Preço: ");
		float preco = scan.nextFloat();

		if (preco < 50) {
			precoFinal = preco + (preco * 0.05f);
		} else if (preco >= 50 && preco <= 100) {
			precoFinal = preco + (preco * 0.10f);
		} else {
			precoFinal = preco + (preco * 0.15f);
		}
		System.out.println("Preço Atual: " + precoFinal);

		if (precoFinal <= 80) {
			System.out.println("Barato");
		} else if (precoFinal > 80 && precoFinal <= 120) {
			System.out.println("Normal");
		} else if (precoFinal > 120 && precoFinal <= 200) {
			System.out.println("Caro");
		} else {
			System.out.println("Muito Caro");
		}

		scan.close();
	}

}
