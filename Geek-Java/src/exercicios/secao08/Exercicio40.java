package exercicios.secao08;

import javax.swing.JOptionPane;

public class Exercicio40 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));

		vetorPar(n);
		JOptionPane.showMessageDialog(null, "Total: " + vetorPar(n));
	}

	private static int vetorPar(int x) {
		int valorPar = 0;
		for (int i = 0; i < x; i++) {
			if (i % 2 == 0) {
				valorPar++;
			}
		}
		return valorPar;
	}
}
