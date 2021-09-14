package exercicios.secao07.parte1;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int multi[] = new int[10];
		int x = 0, j=0;
		

		System.out.print("Digite um número: ");
		x = scan.nextInt();

		for(int i = 0; i < multi.length; i++) {
			if(i % x == 0) {
				multi[j] = i;
				j++; 
			}
		}

		for (int i = 0; i < multi.length; i++) {
			System.out.print(multi[i]+" ");
		}

		scan.close();
	}

}
