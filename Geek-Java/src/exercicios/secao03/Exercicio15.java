package exercicios.secao03;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		System.out.print("Radianos: ");
		Scanner scan = new Scanner(System.in);
			float rad = scan.nextFloat();
			double grau = rad * 180/Math.PI;
			System.out.println("Em Graus: "+grau+"º");
		
		scan.close();
	}
}
