package exercicios.secao04;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float salario, prestacao;

		System.out.print("Salario: ");
		salario = scan.nextFloat();

		System.out.print("Prestação: ");
		prestacao = scan.nextFloat();

		if (prestacao > (salario * 0.20)) {
			System.out.println("Emprestimo não concedido! Limite:" + (salario * 0.20));
		} else {
			System.out.println("Emprestimo concedido! Limite:" + (salario * 0.20));
		}

		scan.close();

	}
}
