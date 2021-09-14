package exercicios.secao03;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		double rad;
		float graus;
		
		System.out.print("Angulo: ");
		graus = keyb.nextFloat();
		rad = graus * Math.PI/180;
		System.out.println("Radianos: "+rad);
		
		keyb.close();		
	}
}
