package exercicios.secao07.parte1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float valor[] = new Float[5];
		int n = 0;

		for (int i = 0; i < valor.length; i++) {
			System.out.print("Numero " + (1 + i) + ": ");
			valor[i] = scan.nextFloat();
		}
		System.out.print("Escolha o Item: ");
		n = scan.nextInt();

		switch (n) { 
		case 0:
			break;
		case 1:
			Arrays.sort(valor);
			break;
		case 2:
			Arrays.sort(valor, Collections.reverseOrder());
			break;
		default:
			System.out.println("Código Invalido");
			break;
		}
		System.out.print("[ ");
		for (int i = 0; i < valor.length; i++) {
			System.out.print(valor[i] + " ");
		}
		System.out.println("]");
		scan.close();
	}

}
