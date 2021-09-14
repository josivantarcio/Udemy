package exercicios.secao04;

import java.util.Scanner;

public class Exercicio34 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float nota, faltas;
		String conceito="";

		System.out.print("Nota aluno: ");
		nota = scan.nextFloat();

		System.out.print("Faltas: ");
		faltas = scan.nextFloat();

		if (nota >= 9 && nota <= 10) {
			if (faltas <= 20) {
				conceito = "A";
			} else {
				conceito = "B";
			}
		} else if (nota >= 7.5f && nota <= 8.9f) {
			if (faltas <= 20) {
				conceito = "B";
			} else {
				conceito = "C";
			}
		} else if (nota >= 5 && nota <= 7.4f) {
			if (faltas <= 20) {
				conceito = "C";
			} else {
				conceito = "D";
			}
		} else if (nota >= 4 && nota <= 4.9f) {
			if (faltas <= 20) {
				conceito = "D";
			} else {
				conceito = "E";
			}
		} else if (nota >= 0 && nota <= 3.9f) {
			if (faltas <= 20) {
				conceito = "E";
			} else {
				conceito = "E";
			}
		} else {
			System.out.println("ERRO! Valor Inválido");
		}
		
		System.out.println(conceito);

		scan.close();
	}
}
