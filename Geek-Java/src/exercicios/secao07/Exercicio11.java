package exercicios.secao07;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		float v[] = new float[10];
		Scanner scan = new Scanner(System.in);
		int negativo = 0, positivo = 0;

		for (int i = 0; i < v.length; i++) {
			System.out.print("Numero: ");
			v[i] = scan.nextFloat();

			if (v[i] > 0) {
				positivo += v[i];
			} else if (v[i] < 0) {
				negativo++;
			} else {
				System.out.println("Valor zerado");
			}
		}
		System.out.println("Soma Positivo: " + positivo);
		System.out.println("Quant. Negativo: " + negativo);
		scan.close();
	} 

}
