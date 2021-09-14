package exercicios.secao07.parte1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a[] = new float[5];
		float maior = 0, menor = 0, soma = 0;
		float media;

		for (int i = 0; i < a.length; i++) {
			System.out.print("Valor: ");
			a[i] = scan.nextFloat();

			if (i == 0) {
				maior = a[i];
				menor = a[i];
			}
			if (a[i] > maior) {
				maior = a[i];
			} else if (a[i] < menor) {
				menor = a[i];
			}
			soma += a[i];
			media = soma / a.length;
		}
		System.out.print("Vetor [");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);

		scan.close();

	}

}
