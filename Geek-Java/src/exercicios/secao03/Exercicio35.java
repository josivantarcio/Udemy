package exercicios.secao03;

import java.util.Scanner;

public class Exercicio35 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
			float a,b,hipo;
			System.out.print("Valor de A: ");
			a = scan.nextFloat();
			System.out.print("Valor de B: ");
			b = scan.nextFloat();
			
			hipo = (float) Math.hypot(a, b);
			
			System.out.println("valor da Hipotetusa: "+hipo);
		
		scan.close();		
	}
}
