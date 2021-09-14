package exercicios.secao04;

import java.util.Scanner;

public class Exercicio41 {
	public static void main(String[] args) {
		Scanner imc = new Scanner(System.in);
		System.out.print("IMC: ");
		float IMC = imc.nextFloat();

		if (IMC <= 18.5f) {
			System.out.println("Abaixo do Peso");
		} else if (IMC >= 18.6f && IMC <= 24.9f) {
			System.out.println("Saudável");
		} else if (IMC >= 25f && IMC <= 29.9f) {
			System.out.println("Peso em Excesso");
		} else if (IMC >= 30f && IMC <= 34.9f) {
			System.out.println("Obesidade Grau I");
		} else if (IMC >= 35f && IMC <= 39.9f) {
			System.out.println("Obesidade Grau II(Severa)");
		} else {
			System.out.println("Obesidade Grau III(Mórbida)");
		}

		imc.close();

	}
}
