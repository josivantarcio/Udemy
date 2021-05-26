package exercicios.secao03;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float m2, hect;
		System.out.print("Tamanho em m2: ");
		m2 = scan.nextFloat();
		hect = m2 * 0.0001f;
		System.out.println("Tamanho em Hectares: "+hect);
		scan.close();

	}

}
