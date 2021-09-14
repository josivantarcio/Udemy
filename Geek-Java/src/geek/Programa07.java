package geek;

import java.util.Scanner;

public class Programa07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int idade;
		String nome;

		while (true) {

			System.out.print("Digite o nome: ");
			nome = scan.nextLine();

			System.out.print("Digite a Idade: ");
			idade = Integer.parseInt(scan.nextLine());
			if (idade <= 0) {
				break;
			}

			System.out.println(nome + " tem " + idade + " anos.");

		}

		scan.close();
		System.out.println("FIM");
	}
}
