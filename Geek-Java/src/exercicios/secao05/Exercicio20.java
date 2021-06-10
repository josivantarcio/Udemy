package exercicios.secao05;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0, pares = 0, total = 0;

		while (n != 1000) {
			System.out.print("Número ");
			n = scan.nextInt();
			total++;
			if (n % 2 == 0) {
				System.out.println("<< Par >>");
				pares++;
			} else {
				System.out.println("<< Impar >>");
			}
		}
		System.out.println("Total Geral: " + total + "\nPares: " + pares);

		scan.close();

	}

}
