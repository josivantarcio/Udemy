package geek;

import java.util.Scanner;

public class Programa08 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);

		String name;
		int idade;

		do {
			System.out.print("Nome: ");
			name = keyb.nextLine();

			System.out.print("Idade: ");
			idade = Integer.parseInt(keyb.nextLine());
			if (idade <= 0) {
				break;
			}

			System.out.println(name + " tem " + idade + " anos.");
			System.out.println("===============");

		} while (true);
		keyb.close();
		System.out.println("FIM");
	}
}
