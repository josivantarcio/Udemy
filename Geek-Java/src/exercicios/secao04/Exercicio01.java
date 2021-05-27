package exercicios.secao04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		System.out.print("Valor 01: ");
		n1 = scan.nextInt();

		System.out.print("Valor 02: ");
		n2 = scan.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " É o maior número");
		}else if (n1 < n2) {
			System.out.println(n2 + " É o maior número");
		}else {
			System.out.println("Os números são iguais!");
		}

		scan.close();

	}

}
