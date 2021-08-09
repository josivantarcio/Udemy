package exercicios.secao08;

import javax.swing.JOptionPane;

public class Exercicio07 {
	public static void main(String[] args) {
		double c = Double.parseDouble(JOptionPane.showInputDialog("Temperatura em Celsius"));

		double temp = converter(c);
		System.out.println("A temperatura convertida é: " + temp + "F°");
	}

	public static double converter(double c) {
		double f = c * (9 / 5) + 32;
		return f;
	}
}
