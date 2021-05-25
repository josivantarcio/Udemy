package exercicios.secao03;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
	Scanner keyb = new Scanner(System.in);	
	
	System.out.print("Digite um valor: ");
	float n = keyb.nextFloat();
	float m = (float) Math.pow(n, 2);
	
	System.out.println("A Raiz Quadrada de " + n + " é: " + m);
	
	keyb.close();
	}
}
