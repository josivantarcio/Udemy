package exercicios.secao03;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float m2, hect;
		System.out.print("Tamanho em hectares: ");
		hect = scan.nextFloat();
		m2 = hect * 10000;
		System.out.println("Tamanho em m²: "+m2);	
		
		
		scan.close();
		
	}

}
