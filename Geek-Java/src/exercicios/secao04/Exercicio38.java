package exercicios.secao04;

import java.util.Scanner;

public class Exercicio38 {
	public static void main(String[] args) {
		Scanner ssc = new Scanner(System.in);
		int d = 0, m = 0, y = 0;

		System.out.print("Dia: ");
		d = ssc.nextInt();

		System.out.print("Mês: ");
		m = ssc.nextInt();

		System.out.print("Ano: ");
		y = ssc.nextInt();
		
		System.out.println(d+ m+ y);

		ssc.close();
	}
}
