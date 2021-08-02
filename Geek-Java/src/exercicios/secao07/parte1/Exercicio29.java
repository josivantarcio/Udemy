package exercicios.secao07.parte1;

import java.util.Random;

public class Exercicio29 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num[] = new int[6], pares=0, impares=0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) rand.nextInt(9);
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println("Pares: " + num[i]);
				pares += num[i];
			}else {
				System.out.println("Impares: "+num[i]);
				impares += num[i];
			}

		}
		System.out.println("Soma dos pares "+pares);
		System.out.println("Soma dos Impares "+impares);

	}

}
