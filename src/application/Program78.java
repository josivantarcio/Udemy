package application;

import java.util.Scanner;

public class Program78 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("tamanho da matriz: ");
		int n = sc.nextInt();

		int[][] velha = new int[n][n];
		int soma = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Valor de "+i+" "+j);
				velha[i][j] = sc.nextInt();

				if (velha[i][j] < 0) {
					soma++;
				}
			}

		}
		System.out.println("Lateralização");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					
					System.out.println(velha[i][j]);
				}

			}
		}
		System.out.println("Numeros Impares: "+soma);

		sc.close();
	}

}
