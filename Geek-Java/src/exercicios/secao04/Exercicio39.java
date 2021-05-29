package exercicios.secao04;

import java.util.Scanner;

public class Exercicio39 {
	public static void main(String[] args) {
		float salarioAtual, reajuste = 0, bonus = 0;
		int servico = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Salário: ");
		salarioAtual = scan.nextFloat();
		System.out.print("Tempo de Serviço: ");
		servico = scan.nextInt();

		if (salarioAtual <= 500.00f) {
			reajuste = 0.25f;
		} else if (salarioAtual <= 1000.00f) {
			reajuste = 0.20f;
		} else if (salarioAtual <= 1500.00f) {
			reajuste = 0.15f;
		} else if (salarioAtual <= 2000.00f) {
			reajuste = 0.10f;
		} else {
			System.out.println("Sem Reajuste");
		}

	
		if (servico < 1) {
			System.out.println("Sem Bônus");
		} else if (servico >= 1 && servico <= 3) {
			bonus = 100.00f;
		} else if (servico >= 4 && servico <= 6) {
			bonus = 200.00f;
		} else if (servico >= 7 && servico <= 10) {
			bonus = 300.00f;
		} else {
			bonus = 500.00f;
		}

		float salarioAjustado = salarioAtual + (salarioAtual * reajuste) + bonus;
		System.out.println(salarioAjustado);
		scan.close();
	}
}
