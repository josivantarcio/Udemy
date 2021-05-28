package exercicios.secao04;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// triangulo
		Scanner tri = new Scanner(System.in);
		float ladoA, ladoB, ladoC;

		System.out.print("Lado A: ");
		ladoA = tri.nextFloat();

		System.out.print("Lado B: ");
		ladoB = tri.nextFloat();

		System.out.print("Lado C: ");
		ladoC = tri.nextFloat();

		if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {
			System.out.print("É Triângulo ");
			if ((ladoA == ladoB) && (ladoA == ladoC) && (ladoB == ladoC)) {
				System.out.println("Equilátero.");
			} else if (((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC))) {
				System.out.println("Escaleno");
			} else {
				System.out.println("Isósceles");
			}
		} else {
			System.out.println("Não é um Triangulo!");
		}

		tri.close();
	}

}
