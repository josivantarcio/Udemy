package exercicios.secao08;

import javax.swing.JOptionPane;

public class Exercicio09 {
	public static void main(String[] args) {
		double raio = Double.parseDouble(JOptionPane.showInputDialog("Valor do Raio"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		double resposta = volumeCilidro(raio, altura);
		System.out.println("O volume é: " + resposta);
	}

	public static double volumeCilidro(double r, double a) {
		return Math.PI * Math.pow(r, 2) * a;
	}
}
