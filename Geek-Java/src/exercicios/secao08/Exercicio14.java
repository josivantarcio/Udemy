package exercicios.secao08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Distancia (Km): ");
		double km = scan.nextDouble();
		
		System.out.print("Quantidade Combustível (L): ");
		double litro = scan.nextDouble();
		
		consumo(km,litro);
		
		scan.close();		
	}
	
	private static void consumo(double k, double l) {
		double media = k / l;
		if(media < 8) {
			JOptionPane.showMessageDialog(null, "VENDA O CARRO! "+media);
		}else if(media >= 8 && media <= 14){
			JOptionPane.showMessageDialog(null, "ECONÔMICO "+media);
		}else if(media > 12){
			JOptionPane.showMessageDialog(null, "SUPER ECONÔNICO "+media);
		}
		
	}
}
