package exercicios.secao08;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio54 {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Somatorio: " + matriz());
	}

	private static int matriz() { 
		Random rad = new Random();

		int[][] A = new int[4][4];
		int soma = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				A[i][j] = rad.nextInt(20);
				soma += A[i][j];
			}
		}

		return soma;
	}
}
