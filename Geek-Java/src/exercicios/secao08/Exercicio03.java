package exercicios.secao08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num = scan.nextInt();

		posicao(num);

		scan.close();
	}

	public static void posicao(int n) {
		String pos;
		if (n > 0) {
			pos = "Positivo";
		} else if (n < 0) {
			pos = "Negativo"; 
		} else {
			pos = "Neutro";
		}
		JOptionPane.showMessageDialog(null, pos);
	}
}
