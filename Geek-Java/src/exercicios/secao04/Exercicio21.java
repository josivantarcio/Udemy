package exercicios.secao04;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		float total = 0;
		System.out.println("Escolha a Opção:");
		System.out.println(
				"1- Soma de dois números;\n2- Diferença entre dois números;\n3- Produto entre dois números;\n4- Divisão entre dois números.\n~");
		int n = scan.nextInt();
		switch (n) {
		case 1:
			System.out.print("n1: ");
			n1 = scan.nextInt();
			System.out.print("n2: ");
			n2 = scan.nextInt();
			total = n1 + n2;
			break;
		case 2:
			System.out.print("n1: ");
			n1 = scan.nextInt();
			System.out.print("n2: ");
			n2 = scan.nextInt();
			total = n1 - n2;
			break;
		case 3:
			System.out.print("n1: ");
			n1 = scan.nextInt();
			System.out.print("n2: ");
			n2 = scan.nextInt();
			total = n1 * n2;
			break;
		case 4:
			System.out.print("n1: ");
			n1 = scan.nextInt();
			System.out.print("n2: ");
			n2 = scan.nextInt();
			total = n1 / n2;
			break;
		default:
			System.out.println("ERRO! Número Inválido");
			break;
		}
		System.out.println(total);

		scan.close();
	}

}
