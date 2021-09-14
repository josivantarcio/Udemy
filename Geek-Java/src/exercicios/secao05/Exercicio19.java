package exercicios.secao05;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Digite um numero inteiro entre [100-999] ");
			int n = scan.nextInt();
			if (n >= 100 && n <= 999) {
				String no = Integer.toString(n);
				for (char num : no.toCharArray()) {
					System.out.println(num);
				}
				break;
			} else {
				System.out.print("ERRO! ");
			}
		}
		scan.close();
	}
}
