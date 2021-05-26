package exercicios.secao03;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int n,a,s;
			System.out.print("Digite um número: ");
			n = scan.nextInt();
			a = n - 1;
			s = n + 1;
			
			System.out.println(a +" <- "+ n +" -> "+ s);		
		
		scan.close();
	}

}
