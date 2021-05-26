package exercicios.secao03;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			float raio, area;
			System.out.print("Raio: ");
			raio = scan.nextFloat();
			area =  (int) (Math.PI * Math.pow(raio, 2));
			System.out.println("Area: "+area);		
		
		scan.close();

	}

}
