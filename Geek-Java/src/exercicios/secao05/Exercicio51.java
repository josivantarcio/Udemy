package exercicios.secao05;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio51 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int DataAtual = Calendar.getInstance().get(Calendar.YEAR);

		int ano = 1995;
		float salarioContratado = 100f, salAnoAnterior = 0;

		while (ano < DataAtual) {
			
			if (ano == 1996) {
				salarioContratado = salarioContratado + salarioContratado * 0.015f;
				salAnoAnterior = salarioContratado;
			}
			if (ano >= 1997) {
				salarioContratado = salAnoAnterior * 2;
				
			}
			ano++;
		}

		System.out.println("Salário Atual: " + salarioContratado);
		scan.close();

	}

}
