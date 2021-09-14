package exercicios.secao07.parte2;

public class Exercicio10 {

	public static void main(String[] args) {
		int valor[][] = new int[10][10];
		for (int i = 0; i < valor.length; i++) {
			for (int j = 0; j < valor.length; j++) {
				if (i < j) {
					valor[i][j] = 2 * i + 7 * j - 2;
				} else if (i == j) {
					valor[i][j] = (int) (3 * Math.pow(i, 2) - 1);
				} else {
					valor[i][j] = (int) (4 * Math.pow(i, 3) - 5 * Math.pow(j, 2) + 1);
				}
			}

		}
		for (int i = 0; i < valor.length; i++) {
			for (int j = 0; j < valor.length; j++) {
				System.out.print(valor[i][j] + " ");
				if (j == (valor.length - 1)) {
					System.out.println();
				} 
			}
		}

	}

}
