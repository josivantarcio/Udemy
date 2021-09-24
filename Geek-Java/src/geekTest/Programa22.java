package geekTest;

import java.util.Scanner;

public class Programa22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Primeiro número: ");
		double n1 = scan.nextDouble();
		
		System.out.print("Segundo número: ");
		double n2 = scan.nextDouble();
		
		try {
			System.out.println(n1 /n2);
		}catch (Infinity e) {
			System.out.println("Não pode fazer a divisão por Zero");
		}
		
		
		
		scan.close();
	}
}
