package exercicios.secao03;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Valor R$ ");
		float v = scan.nextFloat();
		float desc = v * 0.12f;
		v = v - desc;
		System.out.println("Desconto de 12% "+v);
		
		scan.close();

	}

}
