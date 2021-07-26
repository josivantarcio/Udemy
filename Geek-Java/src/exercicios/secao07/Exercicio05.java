package exercicios.secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int vPar[] = new int[10];
		Scanner scan = new Scanner(System.in);
		int pares = 0;

		for (int i = 0; i < vetor.length; i++) { 
			System.out.print("Digite um valor: ");
			vetor[i] = scan.nextInt();
			if (vetor[i] % 2 == 0) {
				vPar[pares] = vetor[i];
				pares++;
			}
		}
		System.out.println("Contar: " + pares);
		for (int i = 0; i < vPar.length; i++) {
			System.out.print(" " + vPar[i]);
		}

		scan.close();

	}
}
