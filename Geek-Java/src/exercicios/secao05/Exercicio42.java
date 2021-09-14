package exercicios.secao05;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int n;
		while (true) {
			System.out.print("Numero: ");
			n = keyb.nextInt();
			if (n <= 0) {
				break;
			}
			double quadrado = Math.pow(n, 2);
			double cubo = Math.pow(n, 3);
			double raiz = Math.sqrt(n);

			System.out.println("Quadrado: " + quadrado);
			System.out.println("Cubo: " + cubo);
			System.out.println("Raiz: " + raiz);
		}
		System.out.println("FIM!");
		keyb.close();

	}

}
