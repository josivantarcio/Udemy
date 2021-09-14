package exercicios.secao03;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float p, cm;
		System.out.print("Digite em polegas: ");
		p = scan.nextFloat();
		cm = p * 2.54f;
		System.out.println("Centimentos "+cm);
		
		scan.close();;
	}
}
