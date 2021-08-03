package exercicios.secao07.parte2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Random rad = new Random();
		Scanner scan = new Scanner(System.in);
		int mat[][] = new int[5][5];
		int x = 0;
		int v1 = 0;
		int v2 = 0;
		boolean achei = false;
		String msn = "";

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = rad.nextInt(25);
			}
		}
		System.out.print("Valor de [0 a 25]: ");
		x = scan.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (x == mat[i][j]) {
					msn = "Achei";
					v1 = i;
					v2 = j;
					achei = true;
					break;
				} else {
					msn = "Não Localizado";
				}
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]+" ");
				if(j == (mat.length-1)){
					System.out.println();
				}
			}
		} 

		if (achei) {
			System.out.println("X: " + v1 + " Y: " + v2);
		}
		System.out.println(msn);

		scan.close();
	}

}
