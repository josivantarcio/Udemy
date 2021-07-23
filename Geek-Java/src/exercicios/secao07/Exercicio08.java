package exercicios.secao07;

import java.util.Arrays;
import java.util.Collections;


public class Exercicio08 {

	public static void main(String[] args) {
		Integer a[] = {5,43,5,6,78,9};
		Arrays.sort(a, Collections.reverseOrder());
		
		for(int i = 0; i< a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
