package exercicios.secao07;

public class Exercicio19 {

	public static void main(String[] args) {
		int vet[] = new int[50];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = (i + 5 * i) % (i + 1);
			System.out.println(vet[i]);
		}

	}

}
