package exercicios.secao05;

<<<<<<< Updated upstream
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, maior = 0, menor = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o numero " + i + ": ");
			n = scan.nextInt();

			if (i == 1) {
				maior = n;
				menor = n;
			}
			if (maior < n) {
				maior = n;
			} else if (menor > n) {
				menor = n;
			}

		}
		System.out.print("Menor numero: " + menor);
		System.out.print("\nMaior numero: " + maior);
		scan.close();
=======
public class Exercicio08 {
	public static void main(String[] args) {
>>>>>>> Stashed changes

	}
}
