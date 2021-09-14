package exercicios.secao08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Valor 1: ");
		int v1 = scan.nextInt();

		System.out.print("Valor 2: ");
		int v2 = scan.nextInt();

		System.out.print("Operação: ");
		String sinal = scan.next();

		System.out.println(calculadora(v1, v2, sinal));

		scan.close();
	}

	protected static double calculadora(int a, int b, String x) {
		double solucao = 0;
		if (x.equals("+")) {
			solucao = a + b;
		} else if (x.equals("-")) {
			solucao = a - b;
		} else if (x.equals("*")) {
			solucao = a * b;
		} else if (x.equals("/")) {
			solucao = a / b;
		}
		return solucao;
	}

}
