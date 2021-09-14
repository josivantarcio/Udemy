package exercicios.secao03;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a, m2;
		System.out.print("Apresente o tamanho em Acres: ");
		a = scan.nextFloat();
		m2 = a * 4048.58f;
		System.out.println("Tamanho em m²: "+m2);
		
		
		
		
		scan.close();;
	}
}
