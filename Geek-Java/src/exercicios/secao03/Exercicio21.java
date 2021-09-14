package exercicios.secao03;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			float Lb, Kg;
			System.out.print("Quantidade em Libras: ");
			Lb = scan.nextFloat();
			Kg = Lb * 0.45f;
			System.out.println("Quantidade em Kg: "+Kg);
			
		scan.close();
	}
	
}
