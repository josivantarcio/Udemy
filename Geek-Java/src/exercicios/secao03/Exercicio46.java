package exercicios.secao03;

import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		
		//Inverta um número!
		Scanner scan = new Scanner(System.in);
		System.out.print("Numero: ");
		int n = scan.nextInt();
		n = n / 10;
		
		System.out.println(n);
		

		scan.close();
	}

}
