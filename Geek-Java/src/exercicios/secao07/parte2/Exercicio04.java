package exercicios.secao07.parte2;

import java.util.Random;

public class Exercicio04 {

	public static void main(String[] args) {
		Random rad = new Random();
		int valor[][] = new int[4][4];
		int maior = 0;
		int v1 = 0, v2 = 0;

		for (int i = 0; i < valor.length; i++) {
			for (int j = 0; j < valor.length; j++) {
				valor[i][j] = rad.nextInt(9);
				if (i == 0 && j == 0) {
					maior = valor[i][j];
				}
				if (valor[i][j] > maior) {
					maior = valor[i][j];
					v1 = i;
					v2 = j;
				}
			}
		}

		for (int i = 0; i < valor.length; i++) {
			for (int j = 0; j < valor.length; j++) {
				System.out.print(valor[i][j] + " ");
				if (j == (valor.length - 1)) {
					System.out.println();
				}
			}
		}
		System.out.println(maior);
		System.out.println("Posição X: " + v1 + " Y: " + v2); 
	}

}
