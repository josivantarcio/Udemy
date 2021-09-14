package exercicios.secao03;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		float c, k;
		
		System.out.print("Temperatura em Kº: ");
		k = keyb.nextFloat();
		c = k - 273.15f;
		System.out.println("Temperatura em Cº: "+c);
		
		keyb.close();
	}
}
