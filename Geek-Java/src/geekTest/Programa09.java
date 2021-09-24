package geekTest;

import java.util.Scanner;

//explicando o FOR
public class Programa09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int idade;
		String nome;

		for (int i = 0; i < 3; i++) {
			System.out.print("Nome: ");
			nome = scan.nextLine();

			System.out.print("Idade: ");
			idade = Integer.parseInt(scan.nextLine());
			
			System.out.println("nome "+nome+" idade: "+idade);
		}
		scan.close();
		System.out.println("FIM");
	}
}
