package exercicios.secao04;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Valor do Produto: ");
		float preco = scan.nextFloat();

		System.out.print("Estado: ");
		String estado = scan.next().toUpperCase();

		switch (estado) {
		case "MG":
			preco = preco + preco * 0.07f;
			break;
		case "SP":
			preco = preco + preco * 0.12f;
			break;
		case "RJ":
			preco = preco + preco * 0.15f;
			break;
		case "MS":
			preco = preco + preco * 0.08f;
			break;
		case "CE":
			preco = preco + preco * 0.17f;
			break;
		default:
			System.out.println("ERRO! Sigla não listada!");
			break;
		}

		System.out.println(preco);

		scan.close();

	}

}
