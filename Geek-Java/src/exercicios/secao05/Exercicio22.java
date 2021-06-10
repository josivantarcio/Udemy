package exercicios.secao05;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float nota, acum = 0, media, soma = 0;
		while (true) {
			System.out.print("Digite a nota: ");
			nota = scan.nextFloat();

			if (nota < 10 || nota > 20) {
				System.out.println("FIM");
				break;
			} else {
				acum += nota;
				soma++;
			}
		}
		media = acum / soma;
		System.out.println("Media: " + media);

		scan.close();

	}

}
