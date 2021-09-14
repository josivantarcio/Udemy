package exercicios.secao07.parte1;

import java.util.Arrays;
import java.util.Random;

public class Exercicio36 {

	public static void main(String[] args) {
		Random rad = new Random();
		float n[] = new float[10];

		for (int i = 0; i < n.length; i++) {
			n[i] = rad.nextFloat() * 10;
		}
		Arrays.sort(n);
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}
}
