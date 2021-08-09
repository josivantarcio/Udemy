package exercicios.secao08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int raio = scan.nextInt();

		volumeEsfera(raio);

		scan.close();
	}

	public static void volumeEsfera(int r) {
		double vol = (4 * Math.PI * Math.pow(r, 3)) / 3;
		JOptionPane.showMessageDialog(null, "Resultado: " + vol);
	}

}
