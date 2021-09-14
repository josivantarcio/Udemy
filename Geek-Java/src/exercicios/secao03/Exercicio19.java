package exercicios.secao03;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float L, M;
		System.out.print("Quantidade em Litros: ");
		L = scan.nextFloat();
		M = L/1000;
		System.out.println("Quantidade foi de "+M+"m³");
		
		scan.close();
	}
}
