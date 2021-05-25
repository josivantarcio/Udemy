package exercicios.secao03;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float m, L;
		System.out.print("Quantidade M³: ");
		m = scan.nextFloat();
		L = 1000 * m;
		System.out.println("Quantidade em Litros:"+L);		
		
		scan.close();
	}
}
