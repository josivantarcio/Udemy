package exercicios.secao07.parte2;

import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		Random rad = new Random();
		int m[][] = new int[4][4];
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m.length; j++) {
				m[i][j] = rad.nextInt(9);
			}
		}

		for(int i = 0; i < m.length; i++) { 
			for(int j = 0; j < m.length; j++) {
				System.out.print(m[i][j]+" ");
				 
				if(j == (m.length-1)) {
					System.out.println();
				}
			} 
		}
	} 

}
