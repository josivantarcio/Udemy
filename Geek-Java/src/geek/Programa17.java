package geek;

import java.util.Random;
import java.util.Scanner;

public class Programa17 {

	public static void main(String[] args) {
		int num[] = new int[10];

		System.out.println("tamanho do Vetor: " + num.length);

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 3;
		}

		System.out.println("Vetor na Posicao inicial: "+num[0]);
		System.out.println("Vetor na Posição final: "+num[num.length-1]);
	}

}
