package exercicios.secao03;

import java.util.Scanner;

public class Exercicio53 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float c, l, p;

		System.out.print("Comprimento: ");
		c = scan.nextFloat();

		System.out.print("Largura: ");
		l = scan.nextFloat();

		System.out.print("Preço/mt²: ");
		p = scan.nextFloat();

		System.out.println("Tamanho do terreno " + (c * l) + "m²");
		System.out.println("Valor de R$ " + (c * l * p));

		scan.close();
	}
}
