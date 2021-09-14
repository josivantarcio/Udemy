package exercicios.secao03;

import java.util.Scanner;
public class Exercicio09 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		float k, c;
		
		System.out.print("Temperatura em ºC: ");
		c = keyb.nextFloat();
		k = c + 275.15f;
		System.out.print("Temperatura em ºK: "+k);
				
		keyb.close();
	}
}
