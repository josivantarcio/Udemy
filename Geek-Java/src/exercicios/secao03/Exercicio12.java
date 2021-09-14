package exercicios.secao03;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		float k,m;
		
		System.out.print("Distancia de Milhas: ");
		m = keyb.nextFloat();
		k = m * 1.61f;
		System.out.println("Distancia de Km é: "+k);
				
		keyb.close();
	}
}
