package exercicios.secao04;

import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] agrs) {
		Scanner imc = new Scanner(System.in);
		float alt, peso;

		System.out.print("Altura: ");
		alt = imc.nextFloat();

		System.out.print("Peso: ");
		peso = imc.nextFloat();

		if (alt < 1.20f) {
			if (peso < 60) {
				System.out.println("A");
			} else if (peso >= 60 && peso <= 90) {
				System.out.println("D");
			} else {
				System.out.println("G");
			}
		} else if (alt >= 1.20f && alt <= 1.70f) {
			if (peso < 60) {
				System.out.println("B");
			} else if (peso >= 60 && peso <= 90) {
				System.out.println("E");
			} else {
				System.out.println("H");
			}
		} else {
			if (peso < 60) {
				System.out.println("C");
			} else if (peso >= 60 && peso <= 90) {
				System.out.println("F");
			} else {
				System.out.println("I");
			}
		}

		imc.close();
		;
	}
}
