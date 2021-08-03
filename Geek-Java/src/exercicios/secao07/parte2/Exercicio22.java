package exercicios.secao07.parte2;

import java.util.Random;

public class Exercicio22 {

	public static void main(String[] args) {
		int A[][] = new int[3][3];
		int B[][] = new int[3][3];
		int C[][] = new int[3][3];
		Random rad = new Random();

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				A[i][j] = rad.nextInt(9);
			}
		}

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				B[i][j] = rad.nextInt(9);
			}
		}

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				C[i][j] = A[i][j] * B[i][j];
			}
		}

		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C.length; j++) {
				System.out.print(C[i][j]+" ");
				if(j == (C.length-1)) {
					System.out.println();
				}

			}
		}

	}

}
