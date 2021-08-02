package exercicios.secao07.parte1;

import java.util.Random;

public class Exercicio30 {

	public static void main(String[] args) {
		Random num = new Random();
		int v1[] = new int[10];
		int v2[] = new int[10];
		int v3[] = new int[(v1.length)];

		for (int i = 0; i < v1.length; i++) {
			v1[i] = num.nextInt(v1.length); 
			v2[i] = num.nextInt(v2.length);

		}
		for (int i = 0; i < v1.length; i++) { 
			for (int j = 0; j < v1.length; j++) {
				if (v1[i] == v2[j]) {
					v3[j] = v1[i]; 
				}
			}
		}
		
		for (int i = 0; i < v1.length; i++) {
			System.out.print(v1[i] + " "); 
		}
		System.out.println();
		for (int i = 0; i < v2.length; i++) {
			System.out.print(v2[i] + " ");
		}
		System.out.println(); 
		System.out.print("== ");
		for (int i = 0; i < v3.length; i++) {
			System.out.print(v3[i] + " ");
		} 
	}

}
