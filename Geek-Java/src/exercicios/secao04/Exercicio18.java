package exercicios.secao04;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		float total = 0;

		System.out.print("Número 1: ");
		n1 = scan.nextInt();

		System.out.print("Número 2: ");
		n2 = scan.nextInt();

		System.out.print("Escolha a Operação: [(+), (-), (*), (/)] ");
		String operacao = scan.next();
		System.out.println("===================");

		switch (operacao) {
		case "+":
			total = n1 + n2;
			break;
		case "-":
			total = n1 - n2;
			break;
		case "*":
			total = n1 * n2;
			break;
		case "/":
			total = n1 / n2;
			break;
		}
		System.out.println(total);

		scan.close();
	}

}
