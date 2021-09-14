package exercicios.secao03;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		float a, r, vol;
		System.out.print("Altura: ");
		a = scan.nextFloat();
		
		System.out.print("Raio: ");
		r = scan.nextFloat();
		
		vol = (float) Math.PI * (float) Math.pow(r, 2) * a ;
		System.out.println(vol);
		
		scan.close();

	}

}
