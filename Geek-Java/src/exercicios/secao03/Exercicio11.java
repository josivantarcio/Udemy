package exercicios.secao03;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		float k, m;
		
		System.out.print("Velocidade de m/s: ");
		m = keyb.nextFloat();
		k = m * 3.6f;
		System.out.println("Velocidade transformada é de "+k+"km/h");
		
		keyb.close();
	}
}
