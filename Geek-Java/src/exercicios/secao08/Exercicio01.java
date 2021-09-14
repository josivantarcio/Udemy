package exercicios.secao08;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		System.out.println(dobro(num)); 
	}
	
	static int dobro(int n) {
		return n * 2;
	} 
}
