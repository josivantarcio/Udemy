package exercicios.secao05;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n = scan.nextInt();

		for(int i = n; i >= 0; i--) {
			System.out.println(i);
		}

		scan.close();
	}

}
