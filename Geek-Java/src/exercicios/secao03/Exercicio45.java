package exercicios.secao03;

import java.util.Scanner;

public class Exercicio45 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite Texto: ");
		String txt = scan.nextLine().toLowerCase();
		System.out.println(txt);

		scan.close();
	}

}
