package exercicios.secao07;

public class Exercicio01 {

	public static void main(String[] args) {

		// A
		int A[] = { 1, 0, 5, -2, -5, 7 };

		// B
		int soma = A[0] + A[1] + A[5];
		System.out.println(soma);

		// C
		A[4] = 100;

		// D
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}

	}

}
