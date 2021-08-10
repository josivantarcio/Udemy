package exercicios.secao08;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio11 {
	private static String med;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nota 1: ");
		double nt1 = scan.nextDouble();

		System.out.print("Nota 2: ");
		double nt2 = scan.nextDouble();

		System.out.print("Nota 3: ");
		double nt3 = scan.nextDouble();

		System.out.print("Escolha entre [A ou P]: ");
		String media = scan.next().toUpperCase();

		double solucao = calcularMedia(nt1, nt2, nt3, media);
		JOptionPane.showMessageDialog(null, "RESULTADO: " + solucao);

		scan.close();
	} 

	public static double calcularMedia(double a, double b, double c, String med) {
		double solucao = 0;
		if (med.equals("A")) {
			solucao = (a + b + c) / 3;
		}
		if (med.equals("P")) {
			solucao = (a * 5 + b * 3 + c * 2) / 3;
		} 
		return solucao;

	}

}
