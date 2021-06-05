package exercicios.secao05;

public class Exercicio02 {
//de 1 até 100 usando for, while e do while
	public static void main(String[] args) {
		int ini = 0;

		System.out.println("Usando o for");
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("Usando o while");
		while (ini <= 100) {
			System.out.print(ini + ", ");
			ini++;
		}
		ini=0;
		System.out.println();
		System.out.println("Usando o do While");
		do {
			System.out.print(ini + ", ");
			ini++;
		} while (ini <= 100);
			
		System.out.println("\nFIM");
	}
}
