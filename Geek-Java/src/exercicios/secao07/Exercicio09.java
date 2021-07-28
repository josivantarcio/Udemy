package exercicios.secao07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer pares[] = new Integer[6];
		Integer n = 0, a = 0;

		while (a < 6) {
			
				System.out.print("Digite um numero: ");
				n = scan.nextInt();
				if (n % 2 == 0) { 
					pares[a] = n;
					a++;  
					
				}
		} 
		Arrays.sort(pares, Collections.reverseOrder());
		for(int i = 0; i < pares.length; i++) {
			System.out.print(pares[i]+" ");
		}
		System.out.println();
		Arrays.sort(pares);
		for(int i = 0; i < pares.length; i++) {
			System.out.print(pares[i]+" ");
		}
		
		scan.close(); 
	}
}
