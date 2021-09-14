package exercicios.secao03;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		
		System.out.print("Digite um valor fracionário: ");
		float m = keyb.nextFloat();
		System.out.print("O valor Digitado foi: "+m);
		
		keyb.close();
	}
}
