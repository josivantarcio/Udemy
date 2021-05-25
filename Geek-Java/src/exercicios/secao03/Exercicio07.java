package exercicios.secao03;
import java.util.Scanner;

public class Exercicio07{
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		float f, c;
		
		System.out.print("Temperatura em Fº: ");
		f = keyb.nextFloat();
		c = 5 * (f - 32) / 9;
		System.out.println("Temperatura em Cº: "+c);
		
		
		keyb.close();		
	}

}
