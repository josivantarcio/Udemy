package exercicios.secao03;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int n, a, s;
			System.out.print("Digite um valor: ");
			n = scan.nextInt();
			s = (int) Math.pow((n+1), 3);
			a = (int) Math.pow((n-1), 2);
			int soma = a + s;
			
			System.out.println("Total: "+soma);
		
		scan.close();
	}

}
