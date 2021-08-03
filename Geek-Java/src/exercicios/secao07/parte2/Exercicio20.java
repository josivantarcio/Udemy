package exercicios.secao07.parte2;

import java.util.Random;

public class Exercicio20 {

	public static void main(String[] args) {
		Float valores[][] = new Float[3][6];
		Random rad = new Random();
		int contColuna2e4 = 0, somaColuna2e4 = 0;
		float somaImpar = 0, mediaColuna2e4 = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				valores[i][j] = rad.nextFloat() * 10;
			}
		}
		System.out.println("===========");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(valores[i][j] + " ");
				if (j == (valores.length - 1)) { 
					System.out.println();
				}
			}
		}
		System.out.println("\n============"); 
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (j % 2 != 0) {
					somaImpar += valores[i][j];
				}
				if (j == 2 || j == 4) { 
					contColuna2e4++;
					somaColuna2e4 += valores[i][j]; 
				}
				if (j == 6) {
					valores[i][6] = valores[i][1] + valores[i][2];
				}
			}
		}

		mediaColuna2e4 = somaColuna2e4 / contColuna2e4;
		System.out.println("Somar Impares: " + somaImpar);
		System.out.println("Media das Colunas 2 e 4: " + mediaColuna2e4);
		System.out.println("==========");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(valores[i][j] + " ");
				if (j == (valores.length - 1)) {
					System.out.println();
				}
			}
		}
	}

}
