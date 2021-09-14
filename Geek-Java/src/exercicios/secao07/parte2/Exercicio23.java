package exercicios.secao07.parte2;

import java.util.Random;

public class Exercicio23 {

	public static void main(String[] args) {
		int A[][] = new int[3][3];
		int B[][] = new int[3][3];

		Random rad = new Random();

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				A[i][j] = rad.nextInt(9); 
			}
		}

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				B[i][j] = (int) (Math.pow(A[i][j], 2));
			}
		}

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				System.out.print(B[i][j] + " ");
				if (j == (B.length - 1)) {
					System.out.println();
				} 
			}
		}
	}
}
