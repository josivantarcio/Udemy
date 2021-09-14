package geek;

import java.util.Scanner;

//explicando o FOREACH
public class Programa10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Texto: ");
		String txt = scan.nextLine();

		for (char palavra : txt.toCharArray()) {
			if (palavra == 'a') {
				palavra = 'A';

			}
			System.out.print(palavra);

		}

		scan.close();
	}
}
