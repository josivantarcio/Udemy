package exercicios.secao08;

import java.util.Random;
import java.util.Scanner;

public class Exercicio43 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Tamanho do vetor: ");
		int vetor = scan.nextInt();

		vetor(vetor);

		scan.close();
	}

	private static void vetor(int x) {
		Random rad = new Random();
		int s, varr = 0;
		int[] num = new int[x];
		for (int i = 0; i < num.length; i++) {
			varr++;
			s = rad.nextInt(x);
			num[i] = s; 
			System.out.print(" " + num[i]);
			for (int j = 0; j < i; j++) {
				if ((s == num[j] && j != 0) || (num[0] == s)) {
					i--;
					break;
				}
			}
		}
		System.out.println();
		System.out.println("varreduras: " + varr + "x");
		System.out.println("Possuiu: "+(varr-x)+" repetições");
		for (int valor : num) {
			System.out.print(" " + valor);
		}
	}
}
