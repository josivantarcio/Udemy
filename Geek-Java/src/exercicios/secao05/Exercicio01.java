package exercicios.secao05;

public class Exercicio01 {
//Os cinco primeiros multiplos de 3
	public static void main(String[] args) {
		int cont = 0, i = 0;

		while (i < 5) {
			cont++;
			if (cont % 3 == 0) {
				System.out.println(cont);
				i++;
			}

		}

	}

}
