package exercicios.secao08;

import java.util.Scanner;

public class Exercicio39 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Valor de A: ");
		double a = scan.nextDouble();

		System.out.print("Valor de B: ");
		double b = scan.nextDouble();
		System.out.println("===== Antes =====");
		System.out.println("A " + a);
		System.out.println("B " + b);
		System.out.println("");
		 
		System.out.println("===== Depois =====");
		troque(b, a);
		
		scan.close();
	}

	public static void troque(double a, double b) {
		double c = a, d = b;

		System.out.println("A " + c);
		System.out.println("B " + d);
	}
}
