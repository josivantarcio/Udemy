package exercicios.secao03;

import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float degrau, altura, quantDegraus;
		System.out.print("tamanho do Degrau: ");
		degrau = scan.nextFloat();

		System.out.print("Distancia desejada: ");
		altura = scan.nextFloat();

		quantDegraus = altura / degrau;
		System.out.println("Precisa de " + quantDegraus + " degraus.");
		scan.close();

	}

}
