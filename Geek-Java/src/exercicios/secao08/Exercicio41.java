package exercicios.secao08;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio41 {
	private static Random numRad = new Random();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n = scan.nextInt();

		JOptionPane.showMessageDialog(null, "O Maior Número foi " + vetorMaior(n));

		scan.close();
	}

	private static int vetorMaior(int x) {
		int num, maior = 0; 

		for (int i = 0; i < x; i++) {
			num = numRad.nextInt(99) * 10;
			System.out.println((i+1)+"º - "+num);
			if (i == 0) {
				maior = num;
			}
			if (maior < num) { 
				maior = num;
			}
			if(num == 999) {
				JOptionPane.showMessageDialog(null, "O Número Limite saiu\nPosição: "+(1+i));
				break;
			}
		}
		return maior;
	}
}
