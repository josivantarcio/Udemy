package exercicios.secao07.parte2;

public class Exercicio02 {

	public static void main(String[] args) {
		int gr[][] = new int[5][5];
		
		for(int i = 0; i < gr.length; i++) {
			for(int j = 0; j < gr.length; j++) {
				if(i == j) {
					gr[i][j] = 1;
				}else {
					gr[i][j] = 0;
				}
				System.out.print(gr[i][j]+" ");
				if(j == (gr.length -1)) {
					System.out.println();
				}
			}
		}

	}

}
