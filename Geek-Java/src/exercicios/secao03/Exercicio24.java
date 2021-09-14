package exercicios.secao03;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a, m2;
		System.out.print("Tamanho em m²: ");
		m2 = scan.nextFloat();
		a = m2 * 0.000247f;
		System.out.println("Tamanho em Acres: "+a);
		
		
		scan.close();
	}
}
