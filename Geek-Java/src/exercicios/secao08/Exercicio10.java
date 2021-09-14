package exercicios.secao08;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int a = scan.nextInt();

		System.out.print("Digite o segundo numero: ");
		int b = scan.nextInt();

		maiorQ(a, b);

		scan.close();
	} 

	public static void maiorQ(int a, int b) {
		if (a > b) {
			System.out.println(a + " é Maior");
		} else {
			System.out.println(b + " é Maior");
		}
	}
}
