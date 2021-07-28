package exercicios.secao07;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetor[] = new int[5];
		int maior = 0, menor = 0, contMai = 0, contMen = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Valor " + i +": ");
			vetor[i] = scan.nextInt(); 

			if (i == 0) {
				maior = vetor[i];
				menor = vetor[i];
				contMai = i;
				contMen = i;
			}
			if (vetor[i] > maior) {
				maior = vetor[i];
				contMai = i;
			} else if (vetor[i] < menor) {
				menor = vetor[i];
				contMen = i;
			}
		}
		System.out.println("Posicao do maior: " + contMai);
		System.out.println("Posicao do menor: " + contMen);

		scan.close();

	}

}
