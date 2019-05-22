package application;

import java.util.Scanner;

import entities.Hotel;

public class ProgramHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hotel[] vetor = new Hotel[10];

		System.out.print("Quantidade de quartos para locação? ");
		int numQuartos = sc.nextInt();

		for (int i = 0; i < numQuartos; i++) {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Numero do Quarto: ");
			int quarto = sc.nextInt();

			vetor[quarto] = new Hotel(quarto, nome, email);
		}

		for (Hotel q : vetor) {
			if (q != null) {
				System.out.println( q.getNumQuarto()+" "+ q.toString());
			}
		}

		sc.close();

	}

}
