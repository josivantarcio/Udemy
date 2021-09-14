package exercicios.secao03;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		float k, m;
		
		System.out.print("Distancia em Km: ");
		k = keyb.nextFloat();
		m = k / 1.61f;
		System.out.println("Convertendo para Milhas: "+m);
		
		
		keyb.close();
	}
}
