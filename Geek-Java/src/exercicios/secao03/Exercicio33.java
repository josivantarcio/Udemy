package exercicios.secao03;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o lado: ");
		int l = scan.nextInt();
		l *= 4;
		System.out.println(l);
		
		scan.close();
	}

}
