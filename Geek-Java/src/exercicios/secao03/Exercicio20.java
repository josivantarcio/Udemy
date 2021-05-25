package exercicios.secao03;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float Kg, Lb;
		System.out.print("Quantidade em Kg: ");
		Kg = scan.nextFloat();
		Lb = Kg/0.45f;
		System.out.println("Quantidade em Libras: "+Lb+"lb");
		
		scan.close();
	}

}
