package exercicios.secao08;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio47 {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Quantidade: ");
	}

	private static int matriz() {
		Random rad = new Random();

		int maior = 0, n;
		int[][] mat = new int[4][4];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; i++) {
				n = rad.nextInt(20);
				mat[i][j]  = n; 
				if (mat[i][j] > 10) {
					maior++;
				}
			} 
		}
		return maior;
	}
}
