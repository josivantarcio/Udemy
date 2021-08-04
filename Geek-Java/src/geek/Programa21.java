package geek;

import java.util.Scanner;

public class Programa21 {

	static Scanner scan = new Scanner(System.in);

	static String frutas[];

	public static void main(String[] args) {

		System.out.print("Digite a Quantidade de Frutas: ");
		int quant = Integer.parseInt(scan.nextLine());

		Cadastrar_frutas(quant);
		Imprimir_frutas(quant);

	}

	static void Cadastrar_frutas(int quantidade) {
		frutas = new String[quantidade];
		for (int i = 0; i < frutas.length; i++) {
			System.out.print("Fruta " + (i + 1) + ": ");
			frutas[i] = (String) scan.nextLine();
		}
	}

	static void Imprimir_frutas(int quantidade) {
		for (int i = (quantidade - 1); i >= 0; i--) {
			System.out.println(frutas[i]);
		}
	}

}
