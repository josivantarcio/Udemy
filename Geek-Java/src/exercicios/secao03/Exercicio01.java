package exercicios.secao03;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = keyb.nextInt();
		System.out.println("Voce digitou: "+n);
		
		keyb.close();
	}
}
