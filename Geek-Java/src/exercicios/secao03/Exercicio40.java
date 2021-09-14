package exercicios.secao03;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float diaria = 30.00f, tr = 0.08f;
		int dias;
		System.out.print("Dias trabalhados: ");
		dias = scan.nextInt();

		float valorPago = (diaria * dias) - (diaria * dias) * tr;
		System.out.println("Total Líquido: R$" + valorPago);

		scan.close();
	}

}
