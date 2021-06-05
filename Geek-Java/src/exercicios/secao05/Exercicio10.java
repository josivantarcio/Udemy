package exercicios.secao05;

public class Exercicio10 {

	public static void main(String[] args) {
		int par = 1, soma = 0, i = 0;
		while (i < 50) {
			if (par % 2 == 0) {
				soma += par;
				i++;
			}
			par++;
		}
		System.out.println("total: " + soma);
	}
}
