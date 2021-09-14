package exercicios.secao03;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		float n = keyb.nextFloat();
		float m = n / 5;
		
		System.out.println("A 5ª parte de " + n + " é: " + m);
		
		keyb.close();
	}

}
