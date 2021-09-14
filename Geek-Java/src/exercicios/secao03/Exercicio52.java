package exercicios.secao03;

import java.util.Scanner;

public class Exercicio52 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float premio, j1, j2, j3, percJ1, percJ2, percJ3, aposta;

		System.out.print("Valor do Premio: ");
		premio = scan.nextFloat();

		System.out.print("Valor da Aposta: ");
		aposta = scan.nextFloat();

		System.out.print("Valor do Jogador 01: ");
		j1 = scan.nextFloat();
		percJ1 = j1 * 100 / aposta;

		System.out.print("Valor do Jogador 02: ");
		j2 = scan.nextFloat();
		percJ2 = j2 * 100 / aposta;

		System.out.print("Valor do Jogador 03: ");
		j3 = scan.nextFloat();
		percJ3 = j3 * 100 / aposta;

		j1 = premio * percJ1 / 100;
		j2 = premio * percJ2 / 100;
		j3 = premio * percJ3 / 100;

		System.out.println("Valor do Premio do Jogador 01: R$ "+j1);
		System.out.println("Valor do Premio do Jogador 02: R$ "+j2);
		System.out.println("Valor do Premio do Jogador 03: R$ "+j3);

		scan.close();
	}

}
