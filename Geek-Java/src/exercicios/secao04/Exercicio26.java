package exercicios.secao04;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float km, l;

		System.out.print("Km: ");
		km = scan.nextFloat();

		System.out.print("Litros: ");
		l = scan.nextFloat();

		float km_l = km / l;

		if (km_l < 8) {
			System.out.println("Venda o Carro! " + km_l);
		} else if (km_l >= 8 && km_l <= 14) {
			System.out.println("Econômico! " + km_l);
		} else {
			System.out.println("Super Econômico! " + km_l);
		}

		scan.close();

	}

}
