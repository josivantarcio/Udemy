package exercicios.secao08;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio42 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int num = scan.nextInt();

		JOptionPane.showMessageDialog(null, "A média é: " + media(num));

		scan.close();
	}

	private static double media(int x) {
		Random rad = new Random();
		
		double[] valor = new double[x];
		double soma = 0;
		
		for (int i = 0; i < valor.length; i++) {
			valor[i] = rad.nextDouble() * 10;
			soma += valor[i];
			System.out.println(valor[i]);
		}
		return soma / x;
	}
}
