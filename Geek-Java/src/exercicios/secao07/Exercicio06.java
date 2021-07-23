package exercicios.secao07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int maior = 0, menor = 0;
		int n[] = new int[10];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < n.length; i++) {
			System.out.print("Digite um numero: ");
			n[i] = scan.nextInt();

			if (i == 0) {
				maior = n[i]; 
				menor = n[i];
			}
			if (n[i] > maior) {
				maior = n[i];
			}
			if (n[i] < menor) {
				menor = n[i];
			}
		}

		System.out.println("Maior Número: " + maior);
		System.out.println("Menor número: " + menor);

		scan.close();

	}

}
