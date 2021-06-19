package exercicios.secao05;

import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {
		int menu;
		float velocidade;

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("Velocidade: ");
			velocidade = scan.nextFloat();

			System.out.println("======= MENU =======");
			System.out.println("1 = KM/h -> m/s ");
			System.out.println("2 = m/s  -> KM/h ");
			System.out.println("3 = SAIR");
			menu = scan.nextInt();

			if (menu == 1) {
				velocidade = velocidade / 3.6f;
			} else if (menu == 2) {
				velocidade = velocidade * 3.6f;
			} else {
				break;
			}
			System.out.println(velocidade);
		}
		System.out.println("FIM");
		scan.close();

	}

}
