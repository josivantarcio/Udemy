package exercicios.secao03;

import java.util.Scanner;

public class Exercicio43 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Valor Total: ");
		float valor = scan.nextFloat();
		System.out.println("===============================");
		System.out.println("Desconto 10%: R$" + (valor - valor * 0.10f));
		System.out.println("Parcela de x3: R$" + (valor / 3));
		System.out.println("-------------------------------");
		System.out.println("Comissao %5 A vista: R$" + ((valor - valor * 0.10f) * 0.05f));
		System.out.println("Comissao %5 Parcela: R$" + (valor * 0.05f));

		scan.close();

	}
}
