package exercicios.secao04;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = scan.nextInt();
		if (n > 0) {
			float sq, pw;
			sq = (int) Math.sqrt(n);
			pw = (int) Math.pow(n, 2);
			System.out.println("Raiz quadrada: " + sq);
			System.out.println(n + "²: " + pw);
		}

		scan.close();
	}
}
