package exercicios.secao03;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float p, cm;
		System.out.print("tamanho em cm: ");
		cm = scan.nextFloat();
		p = cm / 2.54f;
		System.out.println("tamanho em polegadas: "+p);
		
		scan.close();
	}
}
