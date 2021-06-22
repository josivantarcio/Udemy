package exercicios.secao05;

import java.util.Scanner;

public class Exercicio49 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float salCarlos = 0, salJoao = 0;
		int meses = 0;

		System.out.print("Salário de Carlos: ");
		salCarlos = scan.nextFloat();

		salJoao = salCarlos / 3;
		System.out.println("Salário de João: " + salJoao);

		while (salCarlos >= salJoao) {
			meses++;
			salCarlos = salCarlos + salCarlos * 0.02f;
			salJoao = salJoao + salJoao * 0.05f;
		}

		System.out.println(meses + " Meses");
		scan.close();
	}
}
