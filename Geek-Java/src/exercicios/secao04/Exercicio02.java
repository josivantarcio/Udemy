package exercicios.secao04;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = scan.nextInt();
		if(n > 0) {
			n = (int) Math.sqrt(n);
			System.out.println(n);
		}else {
			System.out.println("ERRO! Número inválido!");
		}
		
		scan.close();
	}
}
