package exercicios.secao04;

import java.util.Scanner;

public class Exercicio40 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float imposto = 0, comissao = 0, valorFab, valorFinal;

		System.out.print("Preço de Fábrica R$: ");
		valorFab = scan.nextFloat();

		if (valorFab < 12000.00f) {
			comissao = 0.05f;
			System.out.println("ISENTO Imposto");
		} else if (valorFab >= 12000.00f && valorFab <= 25000.00f) {
			comissao = 0.10f;
			imposto = 0.15f;
		} else if (valorFab > 25000.00f) {
			comissao = 0.15f;
			imposto = 0.20f;
		}
		valorFinal = valorFab + valorFab * comissao + valorFab * imposto;
		System.out.println("===================================");
		System.out.println("Valor Fábrica    R$: " + valorFab);
		System.out.println("Comissão          %: " + (comissao * 100) + "%");
		System.out.println("Imposto           %: " + (imposto * 100) + "%");
		System.out.println("===================================");
		System.out.println("Valor Consumidor R$: " + valorFinal);

		scan.close();
	}
}
