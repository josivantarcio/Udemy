package exercicios.secao03;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantidade em Jardas: ");
		float j, m;
		j = scan.nextFloat();
		m = .91f * j;
		System.out.println("Quantidade em metros: "+m);
		
		scan.close();
	}

}
