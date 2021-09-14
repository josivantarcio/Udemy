package exercicios.secao04;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float altura, pesoIdeal = 0;
		int sexo;

		System.out.print("Digite Altura: ");
		altura = scan.nextFloat();

		System.out.print("Digite Sexo [M=1/F=0] ");
		sexo = scan.nextInt();

		if (sexo == 1) {
			pesoIdeal = (72.7f * altura) - 58;
		} else if (sexo == 0) {
			pesoIdeal = (62.1f * altura) - 44.7f;
		}

		System.out.println(pesoIdeal);

		scan.close();
	}
}
