package exercicios.secao07.parte2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[][] = new int[4][4];
		int maior = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.print("Valor: ");
				num[i][j] = scan.nextInt();

				if (num[i][j] > 10) { 
					maior++;
				}
			}
		}

		System.out.println("maiores que 10: " + maior);
	}

}
