package exercicios.secao07.parte1;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float media;
		float notas[] = new float[15];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota do Aluno " + (i + 1) + ": ");
			notas[i] = scan.nextFloat();
		}
		int soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		media = soma / notas.length;
		System.out.println("Media: " + media);

		scan.close();
	}
}
 