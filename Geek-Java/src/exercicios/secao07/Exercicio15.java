package exercicios.secao07;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 6, i = 0, valor = 0;
		int dado[] = new int[x];

		while (i < x) {
			System.out.print("valor " + (i + 1) + ": ");
			valor = scan.nextInt();
			for (int j = 0; j < i; j++) {
				if (valor == dado[j] || valor == 0) {
					i--;
					System.out.println("Numero ja existente! " + dado[j]);
					break;
				} else {
					dado[i] = valor;
				}
			}
			if (i == 0) {
				dado[i] = valor;
			}
				i++; 
			}
			for (int j = 0; j < dado.length; j++) {
				System.out.print(dado[j] + " ");
			}
			
			System.out.println("\nFIM");
			scan.close();
		}
	
}