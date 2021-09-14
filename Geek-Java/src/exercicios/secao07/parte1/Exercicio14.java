package exercicios.secao07.parte1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dado[] = new int[10];

		for (int i = 0; i < dado.length; i++) {
			System.out.print("dado " + (i+1) + ": ");
			dado[i] = scan.nextInt(); 
			for (int j = 0; j < i; j++) {
				if (dado[i] == dado[j]) {
					System.out.println("Numero ja existente! " + dado[j]);
					break;
				}
			}  
		}
		System.out.println("FIM");
		scan.close();
	}

}
