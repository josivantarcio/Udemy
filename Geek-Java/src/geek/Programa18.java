package geek;

public class Programa18 {

	public static void main(String[] args) {
		// declarar
		int num[][];

		// declarar e definir o tamanho
		int num2[][] = new int[2][3];

		// declarar, definir o tamanho e inicializar
		int num3[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < num3.length; i++) {
			for (int j = 0; j < num3[i].length; j++) {
				//System.out.println(num3[i][j]);
			}
		// declarar uma matriz informando apenas as linhas
		int num4[][] = new int[2][];
		//System.out.println(num4.length);
		
		num4[0] = new int[5];
		num4[1] = new int[3];
		//System.out.println(num4.length);
		
		int num5[][] = {{1,2},{1,2,3,4,5,},{9,10,11}};
		System.out.println(num4.length);
		
		}
	}
}
