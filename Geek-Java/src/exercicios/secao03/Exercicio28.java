package exercicios.secao03;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int v1,v2,v3,qv1,qv2,qv3,soma;
		System.out.print("Valor #1: ");
		v1 = scan.nextInt();
		qv1 = (int) Math.pow(v1, 2);
			
		System.out.print("Valor #2: ");
		v2 = scan.nextInt();
		qv2 = (int) Math.pow(v2, 2);
		
		System.out.print("Valor #3: ");
		v3 = scan.nextInt();
		qv3 = (int) Math.pow(v3, 2);
		
		soma = qv1 + qv2 + qv3;
		System.out.println("A soma dos valores foi: "+soma);
		
		
		scan.close();

	}

}
