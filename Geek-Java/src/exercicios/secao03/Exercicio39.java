package exercicios.secao03;

import java.util.Scanner;

public class Exercicio39 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float j1, j2, j3, premio;

		System.out.print("valor do premio R$ ");
		premio = scan.nextFloat();

		j1 = premio * 0.46f;
		System.out.println("Premio #1 R$: " + j1);

		j2 = premio * 0.32f;
		System.out.println("Premio #2 R$: " + j2);

		j3 = premio - (j1 + j2);
		System.out.println("Premio #3 R$: " + j3);

		scan.close();
	}
}
