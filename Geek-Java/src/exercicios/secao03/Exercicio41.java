package exercicios.secao03;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float vlHora, vlPago;
		int contHoras;

		System.out.print("Valor da Hora: R$");
		vlHora = scan.nextFloat();

		System.out.print("Quant. Horas: ");
		contHoras = scan.nextInt();

		vlPago = (vlHora * contHoras) + (vlHora * contHoras) * 0.10f;
		System.out.println("Valor Pago: " + vlPago);

		scan.close();

	}

}
