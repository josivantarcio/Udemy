package exercicios.secao04;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Numero: ");
		int n = scan.nextInt();

		if (n < 0) {
			System.out.println("Número Inválido!");
		} else {
			n = (int) Math.log(n);
			System.out.println(n);
		}

		scan.close();
	}

}
