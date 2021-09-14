package exercicios.secao03;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float salBase, imposto = 0.07f, gratificacao = 0.05f, valorFinal;

		System.out.print("Salario Base: ");
		salBase = scan.nextFloat();
		valorFinal = salBase + (salBase * gratificacao) - (salBase * imposto);
		System.out.println("Salário: " + valorFinal);

		scan.close();
	}
}
