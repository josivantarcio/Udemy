package exercicios.secao07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int v[] = new int[10];
		int maior = 0, posicao = 0; 

		for (int i = 0; i < v.length; i++) {
			System.out.print("Digite um numero: ");
			v[i] = scan.nextInt();
			if(i == 0) {
				maior = v[i];
			}
 			if (v[i] > maior) {
				maior = v[i];
				posicao = i;
			}
		}
		System.out.print("Vetor:[");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println("]");
		System.out.println("Maior: " + maior);
		System.out.println("Posição: " + posicao);

		scan.close();

	}

}
