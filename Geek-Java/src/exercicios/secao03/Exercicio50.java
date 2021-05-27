package exercicios.secao03;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio50 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade, anoNascimento, anoAtual;
		System.out.print("Idade: ");
		idade = scan.nextInt();
		anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		anoNascimento = anoAtual - idade;
		System.out.println("Ano: " + anoNascimento);

		scan.close();
	}
}
