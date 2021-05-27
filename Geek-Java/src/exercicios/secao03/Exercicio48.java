package exercicios.secao03;

import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h, m, s;

		System.out.print("Tempo /s: ");
		int t = scan.nextInt();
		s = t % 60;
		m = (t-s) % 60;
		h = (t-m) / 60;
		
		
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);

		scan.close();

	}

}
